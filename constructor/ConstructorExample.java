package constructor;

/**
 * Created by ksv on 11/15/16.
 */
public class ConstructorExample {
    public ConstructorExample(){
        System.out.println("Hello constructor default");
    }

    public ConstructorExample(String message){
        System.out.println("Hello constructor " + message);
    }

    public static void main(String[] args) {
        new ConstructorExample();
        new ConstructorExample("Hello constructor");
    }
}
