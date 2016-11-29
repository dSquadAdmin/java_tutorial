package inheritance.classinheritance;


/**
 * Created by ksv on 11/18/16.
 */
public class Square extends Rectangle {
    public Square(){
        super.setProperties();
    }

    @Override
    public void area(){
        System.out.println("Square area:"+(length*length));
    }

    @Override
    public void perimeter(){
        System.out.println("Square Perimeter"+(4*length));
    }
}
