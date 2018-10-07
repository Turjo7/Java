
package sakhhor.sir;

class Car{
    public void abc(){
        System.out.println("Toyota");
    }
}
class Bus{
    public void show(){
        System.out.println("Bus");
    }
    
}

public class TestInstanceof {
    public static void main(String[] args){
        Car obj1 = new Car();
        Bus obj2 = new Bus();
        TestInstanceof t = new TestInstanceof();
        t.test(obj2);
        t.test(obj1);
               
    }
    public void test(Object obj){
        if(obj instanceof Car){
            System.out.println("I Am From Car Class");
        }
        else{
            if(obj instanceof Bus){
                System.out.println("I Am From Bus Class");
            }
        }
    }
    
}
