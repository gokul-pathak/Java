class Employee{
    int id, salary;
    String name;
    public void printDetails(){
        System.out.print("My id is "+ id +" and ");
        System.out.println("My name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee gopal = new Employee(); // Instantiating a new employee object
        Employee Ram = new Employee(); // Instantiating a new employee object
        //Setting attributes
        gopal.id = 12;
        gopal.salary = 17000;
        Ram.id = 13;
        Ram.salary = 16000;
        gopal.name = "ErrorGamingNepal";
        Ram.name = "TechnologyRam";

        //printing the attributes.
        gopal.printDetails();
        Ram.printDetails();
        int salary = Ram.getSalary();
        System.out.println(salary);
//        System.out.println(gopal.id);
//        System.out.println(gopal.name);
    }
}
