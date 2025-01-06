package hemel.ClassTwentythree;

public class Employee {

    public static void main(String[] args) {


        EmployeeClass a = new EmployeeClass("Hemel", "1994", 12500, "Mirpur-1");
        EmployeeClass b = new EmployeeClass("Hasfd", "1984", 12500, "Mirpur-1");
        EmployeeClass c = new EmployeeClass("dfsad", "1999", 12500, "Mirpur-1");





        System.out.println("Name" + "\t" + "year_of_joining" + "\t" +"Address");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
