package staticmembers;

/**
 * Created by ksv on 11/23/16.
 * Non Static members are associated with object while Static members are associated with class.
 * Static properties can be called by using ClassName.member i.e. in following example we can use
 * Student.lastName instead of student.lastName (or stu.lastName).
 */
public class StudentService {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.print(stu.name+" ");
        System.out.println(stu.lastName); // Though it is allowed but should be avoided.
        stu.name = "XYZ";
        stu.lastName ="Chalise";
        Student student = new Student();
        System.out.print(student.name+" ");
        System.out.println(Student.lastName);// Static members should be accessed using class name
    }
}
