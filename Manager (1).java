class Employee
{
    public String name = "TURJO";
    public int salary = 1000000;
    public void showDetails()
    {
        System.out.println("Name: "+ name + "\tSalary: "+salary );
        
    }
}

public class Manager extends Employee
{
    // In invoking overriding parent and child have same method when we run the code both of their method will be executed
    public String department ="Engineering";
    
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Department: "+department);
        //super.showDetails();
        
    }
    public static void main(String[] args)
    {
        Manager manager = new Manager();
        manager.showDetails();
        
    }
    
}
