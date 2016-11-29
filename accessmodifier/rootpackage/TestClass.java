package accessmodifier.rootpackage;

/**
 * Created by ksv on 11/17/16.
 */
public class TestClass {
    public static void main(String[] args) {
        VisibilityTest test = new VisibilityTest();
        System.out.println(test.protectedNum);
        System.out.println(test.defaultNum);
        System.out.println(test.publicNum);
    }
}
