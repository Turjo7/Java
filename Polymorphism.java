
package javabasiclevelcoding;


class Parent{
     public void show(){
        System.out.println("Java From Parent Class");
    }
    
}

public class Polymorphism extends Parent {
    
    public void show(){
        System.out.println("Java");
    }
    public static void main(String[] args){
        Parent obj = new Polymorphism();
        obj.show();
        
    }
    
}
