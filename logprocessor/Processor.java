package logprocessor;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.io.*;
import java.security.PublicKey;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by ksv on 11/20/16.
 */
public class Processor {
    private final String DAY_MATCH = "\\d{4}-\\d{2}-\\d{2}";
    private final String WARNING_MATCH = "\\bwarning\\b";
    private final String ERROR_MATCH = "\\berror\\b";
    private HashMap<String, HashMap<String, Integer>> summary = new HashMap();
    private HashMap<String, Integer> data = new HashMap();
    private boolean logFlag= false;
    private String[] files;
    private String logfile;
    private Pattern datePattern;
    private Pattern errorPattern;
    private Pattern warningPattern;

    FileWriter out;
    BufferedWriter writer;

    public Processor(String[] files, Boolean logFlag){
        summary.clear();

        data.put("warning", 0);
        data.put("error", 0);

        this.files = files;
        this.logFlag = logFlag;
        if (this.logFlag) {
            Date date = new Date();
            this.logfile = "Summary-" +date.getYear()+"-"+date.getMonth()+"-"+date.getDay()+"-"+date.getMinutes()+ ".log";
        }

        datePattern = Pattern.compile(DAY_MATCH);
        errorPattern = Pattern.compile(ERROR_MATCH);
        warningPattern = Pattern.compile(WARNING_MATCH);
    }

    public void initLog(){
        try {
            out = new FileWriter(logfile);
            writer = new BufferedWriter(out);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public void summarize(){
        String previousKey = "xyz";
        String key;
        initLog();
        for (String filename: files) {
            try {
                File file = new File(filename);
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine())!=null){
                    Matcher date = datePattern.matcher(line);
                    Matcher warningKey = warningPattern.matcher(line);
                    Matcher errorKey = errorPattern.matcher(line);

                    if (date.find()){
                        key = date.group(0);
                        if( summary.containsKey(key)){
                            previousKey = key;
                            if (warningKey.find()){
                                data.put("warning",data.get("warning")+1);
                            }
                            if(errorKey.find()){
                                data.put("error",data.get("error")+1);
                            }
                            summary.put(key, data);
                        }else{
                            String newKey =date.group(0);
                            if(!previousKey.equals(newKey)&& !summary.isEmpty()){
                                previousKey = newKey;
                                data.clear();
                                data.put("warning", 0);
                                data.put("error", 0);
                            }
                            if (warningKey.find()){
                                data.put("warning",data.get("warning")+1);
                            }
                            if(errorKey.find()){
                                data.put("error",data.get("error")+1);
                            }
                            summary.put(key, data);
                        }

                        System.out.println(summary);
                    }

                }
            }
            catch (IOException e){
                System.out.println("Couldn't open file"+filename);
            }
        }
        try{
            writer.write(summary.toString());
        }
        catch (IOException e){

        }

    }


    public static void main(String[] args) {
        Processor proc = new Processor(args, true);
        proc.summarize();
    }
}
