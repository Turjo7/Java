
package sakhhor.sir;

abstract class Animal{
    public void type(){
        System.out.println("I am Fom Abstract Class");
    }
    public abstract void name();
    
}

interface Cat{
    public abstract void jump();
    void run();
        
    
    
}
interface Bird{
    void fly();    
}
public class Tiger extends Animal implements Cat,Bird{

    @Override
    public void name() {
        System.out.println("Tiger");
    }

    @Override
    public void jump() {
        System.out.println("Tiger Can Jump");
    }

    @Override
    public void run() {
        System.out.println("Tiger Can Run");
        
    }

    @Override
    public void fly() {
       System.out.println("Tiger Can Not Fly");
    }
    
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.name();
        t.jump();
        t.run();
        t.fly();
    }
    
}
