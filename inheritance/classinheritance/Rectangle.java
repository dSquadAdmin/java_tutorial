package inheritance.classinheritance;

/**
 * Created by ksv on 11/18/16.
 */
public class Rectangle extends Polygon {
    public Rectangle(){
        super.setProperties();
    }
    public void area(){
        System.out.println("Area :"+(length*breadth));
    }

    public void perimeter(){
        System.out.println("Perimeter :"+(2*(length+breadth)));
    }
}
