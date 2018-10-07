
package javabasiclevelcoding;

class Cplusplus{
     public void color(){
        System.out.println("I Am From Parent Class- c++");
    }
    
}

public class Java extends Cplusplus{
    
    public void color(){
        super.color();   // Invoking Overriding method 
        System.out.println("I Am From Child Class- java");
        super.color();
        
    }
    
    public static void main(String[] args){
        Java obj = new Java();
        obj.color();
    }
    
}
