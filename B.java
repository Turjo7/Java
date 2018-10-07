 class A
{
    public void show()
    {
        System.out.println("From Parent The Message Is => Bird Can Fly In The Sky");
    }
    
}

public class B extends A
{
    // In overriding parent and child may have same method, when we run the program the code of child class will be executed
    public void show()
    {
     System.out.println("From Child The Message Is => Bird Can Fly In The Sky");
    }
    public static void main(String[] args)
    {
        B b = new B();
        b.show();
    }
    
}
