
package sakhhor.sir;

class Cricket{
    int run=50;
    //runtime polymorphism can't be achieved by data members.
}

public class Test_Polymorphism1 extends Cricket{
    float run=150;
    public static void main(String[] args){
       Cricket object  = new Test_Polymorphism1 ();
        System.out.println("The Value: "+object.run);
    }
    
}
