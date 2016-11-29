package inheritance;

import inheritance.classinheritance.Rectangle;
import inheritance.classinheritance.Square;

/**
 * Created by ksv on 11/18/16.
 */
public class Main extends Rectangle {
    public static void main(String[] args) {
        new Main().area();
        new Square().area();
    }
}
