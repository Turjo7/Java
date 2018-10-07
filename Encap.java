
package javabasiclevelcoding;

class Test85{
//    private int number;
      private int a;    
    public Test85(int a){
       if(a>1000){
           this.a=a;
       }
        
    }
    public int getA(){
        
        return a;
    }
    
}


public class Encap {
    
    public static void main(String[] args){
        int password=123456;
        String user_name="TURJO";
        Test85 object = new Test85(100000);
//        object.setA(100000);
        
        if(password==123456&&user_name=="TURJO")
        System.out.println("You Have Set : "+object.getA());
        
        
    }
    
}
