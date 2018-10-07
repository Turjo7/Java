
package sakhhor.sir;

interface Bounceable{
    public abstract void bounce();
    void setBounce(int b);
    
}

public class Tire implements Bounceable{
    public void bounce(){
        System.out.println("LOVE");
        
   }
    public void setBounce(int b){
         int a = b;
         System.out.println(a);
    }
     public static void main(String[] args){
         Tire object = new Tire();
         object.bounce();
         object.setBounce(86);
     }
    
}
