package accessmodifier.childaccess;

import accessmodifier.rootpackage.VisibilityTest;

/**
 * Created by ksv on 11/17/16.
 */
public class VisibilityTestChild extends VisibilityTest {
    public void printInFo(){
        System.out.println(protectedNum);
        System.out.println(publicNum);
    }
}
