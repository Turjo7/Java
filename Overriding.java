
package javabasiclevelcoding;


class Turjo{
    
    public void programmer(){
        System.out.println("Shakib Is The Best All Rounder");
        
    }
    
}

public class Overriding extends Turjo{
   
    public void programmer(){
        super.programmer();
        System.out.println("Shakib Will Lead Dhaka Dynamites In The BPL 2016");
    }
    
    public static void main(String[] args){
         Overriding object = new  Overriding ();
         object.programmer();
        
    }
    // If we override then the method of child class will execute.
    //If we use super keyword then the method of parent class will execute
    // In override the method of parent class and child class  must have same argument list , return type,same parameter
   //By using super keyword we can invoke the the method of the parent.
    //We can invoke a method in any place in the function
    // But we can not invoke constructor any place.We have to use it first 
}

