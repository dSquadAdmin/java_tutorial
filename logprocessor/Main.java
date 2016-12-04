package logprocessor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ksv on 11/21/16.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\d\\d\\d\\d)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
        }else {
            System.out.println("NO MATCH");
        }
    }
}
