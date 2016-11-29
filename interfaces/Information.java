package interfaces;

/**
 * Created by ksv on 11/23/16.
 * Interface have all methods abstract by default.
 * Any variables defined in interface are final by default.
 * JDK 8 onward we can define default methods.
 */
public interface Information {
    public void setInformation();
    public void getInformation();

    public default void displayInfo(){ // this is only valid since jdk 8 and is called default method
        System.out.println("This is default method");
    }
}
