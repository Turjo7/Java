
package javabasiclevelcoding;

class Man{
    public int a;
    public int b;
    public Man(){
        
    }
    public void fly(){
        System.out.println("Man Can Not Fly");
    }
}
class SuperMan extends Man{
    public SuperMan(){
        
    }
    public void fly(){
        System.out.println("Super Man Can Fly");
    }
}
class SpiderMan extends Man{
    public SpiderMan(){
        
    }
    public void fly(){
        System.out.println("SpiderMan Can Jump");
    }
}
public class TestHomoGeneous {
    
    public static void main(String[] args){
        Man[] arr = new Man[3];
        arr[0]=new Man();
        arr[1] = new SpiderMan();
        arr[2]= new SuperMan();
       
    }
    
}
