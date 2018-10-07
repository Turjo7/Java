
package sakhhor.sir;

class Turjo{
    
}

// The code will show error , cause we can not inherit a final class

public class Final3 extends Turjo{
    public void show(){
        System.out.println("We Can Inherit A Final Class");
    }
    public static void main(String[] args){
        
        Final3 object = new Final3();
        object.show();
    }
}
