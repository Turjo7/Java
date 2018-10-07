abstract class Animal
{
    public void type()
    {
        System.out.println("Animal");
    }
    public abstract void name();
}

interface Cat
{
    public abstract void jump();
    void run();
}

interface  Bird1
{
    void fly();
}


public class Tiger extends Animal implements Cat,Bird1
{
    public void name()
    {
        System.out.println("Tiger");
    }
    public void jump()
    {
        System.out.println("Tiger Can Jump");
    }
    public void run()
    {
        System.out.println("Tiger Can Run");
    }
    public void fly()
    {
        //System.out.println("Billu Can Not Fly");
    }
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger();
        tiger.type();
        tiger.name();
        tiger.jump();
        tiger.run();
        tiger.fly();
        
    }
    
}
