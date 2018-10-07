
package mid;

abstract class Vehicle2{
    public Vehicle2(){
        
    }
    public int a;
    public String b;
    public abstract void goFast();
    public void show(){
        System.out.println("I Am Abstract Class");
    }
}

public class Vehicle1 extends Vehicle2 {
    
    public void goFast(){
        System.out.println("Abstract Gone");
    }
    public static void main(String[] args){
//        Vehicle2 obj = new Vehicle2();
          Vehicle1 obj1 = new Vehicle1();
          obj1.show();
          obj1.goFast();


    }
}
