
class Employee1
{
    public String name;
    public int salary;
    public Employee1(String name,int salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public void showDetails()
    {
        System.out.println("Name: "+name+"\tSalary: "+salary);
    }
            
    
}

public class Manager1 extends Employee1
{
    // Invoking parent class constructor
    // Invoking means calling the constructor of parent from the constructor of child
    public String department;
    public Manager1(String department)  // Constructor
    {
        super("Turjo",100000); //Calling the constructor of parent class
        this.department = department;
    }
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Department: "+department);
    }
    public static void main(String[] args)
    {
        Manager1 manager1 = new Manager1("Engineering");
        manager1.showDetails();
        
        
    }
    
}
