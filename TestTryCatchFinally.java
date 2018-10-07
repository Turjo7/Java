
public class TestTryCatchFinally 
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
            System.out.println("Exception");
        }
        finally
        {
            System.out.println("Finally Block Must Execute");  // finally is the final block, it always execute
        }
    }
    
}
