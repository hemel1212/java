package hemel.ClassTwentyOne;

public class ManagerClass extends Employee{

    @Override
    public void work() {
        System.out.println(" Manager is managing human resource.");
    }

    @Override
    public double getSalary() {
        return 40000;
    }

    public void addEmployee(){
        System.out.println(" manager is added a new employee.");
    }

    public static void main(String[] args) {

        Employee em =  new Employee();
        em.work();
        System.out.println("Employee salary: "+em.getSalary());

        System.out.println("\n\n");

        ManagerClass Manager= new ManagerClass();
        Manager.work();
        Manager.addEmployee();
        System.out.println(" Manager salary: "+ Manager.getSalary());
    }
}