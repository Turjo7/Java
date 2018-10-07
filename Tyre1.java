interface Bouceable
{
    public abstract void bounce();
    void setBounce(int bounce);
}

public class Tyre1
{
    public void bounce ()
    {
        System.out.println("Tyre Is Bounceable");
    }
    
    public void setBounce(int bounce)
    {
        int a = bounce;
        System.out.println(a);
    }
    
    public static void main(String[] args)
    {
        Tyre tyre = new Tyre();
        tyre.bounce();
        tyre.setBounce(15);
    }
    
}
