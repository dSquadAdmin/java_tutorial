package abstractandfinal;

import java.util.Objects;

/**
 * Created by ksv on 11/22/16.
 */
public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected char sex;
    protected String post;
    protected long salary;

    public abstract void setName(String firstName, String lastName, char sex);
    public abstract void setAddress(String address);
    public abstract void setPost(String post);
    public abstract void setSalary(long salary);
}
