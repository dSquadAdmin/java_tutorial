package constructor;

/**
 * Created by ksv on 11/16/16.
 * Polymorphism example, same methods are used to perform different task
 */
public class Polygon {
    private float length;
    private float breadth;
    private float radius;
    private float area;

    public void calculateAreaReact(){
        area = length*breadth;
    }

    public void calculateAreaCircle(){
        area = (float)Math.PI*radius*radius;
    }

    public Polygon(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
        calculateAreaReact();
    }

    public Polygon(float radius){
        this.radius = radius;
        calculateAreaCircle();
    }

    public float getArea(){
        return this.area;
    }


    public static void main(String[] args) {
        System.out.println("Area of rectangle = "+ new Polygon(3, 6).getArea());
        System.out.println("Area of Circle = "+ new Polygon(3).getArea());
    }
}
