/**
 * Created by x3727349s on 16/01/17.
 */
public class Employee {

    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee(){}

    public Employee(String fname, String lname, int salary) {
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
    }


    public void setId(int id) {this.id = id;}
    public void setSalary(int salary) {this.salary = salary;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;    }

    public int getId() {return id;}
    public int getSalary() {return salary;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}





}