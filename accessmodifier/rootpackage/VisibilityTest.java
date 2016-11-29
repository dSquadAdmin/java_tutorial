package accessmodifier.rootpackage;

/**
 * Created by ksv on 11/17/16.
 */
public class VisibilityTest {
    private int privateNum = 1;  // class level visibility
    protected int protectedNum = 2; // Child class level and with in the package
    public int publicNum = 3; // to the whole project
    int defaultNum = 4; // package level visibility
}
