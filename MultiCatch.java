
public class MultiCatch 
{
    public static void main(String[] args)
    {
        int number;
        try
        {
            number = (9/0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(Exception ex)
        {
            System.out.println("Exception"); // Always write your main exception last 
        }
    }
    
}
