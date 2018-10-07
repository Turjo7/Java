interface AB
{
    public abstract void printHello();
    void printGoodbye();
}

interface Bounceable extends AB
{
    public abstract void bounce();
    void setBounce(int bounce);
}
public class Tyre implements Bounceable
{
    public void printHello()
    {
        System.out.println("Hello");
    }
    
    public void printGoodbye()
    {
        System.out.println("Good Bye");
    }
    
    public void bounce()
    {
        System.out.println("Tyre Is Bounceale");
    }
    public void setBounce(int bounce)
    {
        int a = bounce;
        System.out.println("Bounce Value: "+a);
    }
    public static void main(String[] args)
    {
        //Interface can not be extened
        // We have to implement interface
        // We can declare method only in interface 
        // We can not use interface directly 
        // Interface helps to use multiple inheritence in java
        Tyre tyre = new Tyre();
        tyre.printHello();
        tyre.printGoodbye();
        tyre.bounce();
        tyre.setBounce(15);
    }
    
}
