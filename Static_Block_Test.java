
package sakhhor.sir;


public class Static_Block_Test {
   static {
        System.out.println("BPL 2016 Dhaka Dynamites");
    }   // Static block executed only one time
    public void show(){
        System.out.println("Match Starts Today");
    }
    public static void main(String[] args){
        Static_Block_Test obj1= new Static_Block_Test();
       Static_Block_Test obj2= new Static_Block_Test();
       Static_Block_Test obj3= new Static_Block_Test();
        obj1.show();
        obj2.show();
        obj3.show();
    }
    
}
