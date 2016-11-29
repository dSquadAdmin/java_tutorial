package accessmodifier.outsideclass;

import accessmodifier.rootpackage.VisibilityTest;

/**
 * Created by ksv on 11/17/16.
 */
public class AccessFromOut {
    public static void main(String[] args) {
        VisibilityTest test = new VisibilityTest();
        System.out.println(test.publicNum);
    }
}
