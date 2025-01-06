package hemel.ClassTwentythree;

public class EmployeeClass {


    public EmployeeClass(String name, String year_of_joining, int salary, String address) {
        this.Name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear_of_joining() {
        return year_of_joining;
    }

    public void setYear_of_joining(String year_of_joining) {
        this.year_of_joining = year_of_joining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String Name;
    private String year_of_joining;
    private int salary;
    private String address;

    @Override
    public String toString() {
        return  Name + "\t" + year_of_joining + "\t\t\t " + address;
    }
}


