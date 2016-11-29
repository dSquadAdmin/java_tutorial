package staticmembers;

/**
 * Created by ksv on 11/23/16.
 */
public class Student {
    String name = "Ram";
    static String lastName = "Chandra";
    public String getName(){
        return this.name;
    }
}
