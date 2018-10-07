
package javabasiclevelcoding;

class Cat{
    public String x;
    public int y;
    public Cat(String x,int y){
        this.x=x;
        this.y=y;
    
}
    public void show(){
        System.out.println(x+ " "+y);
    }
    
}

public class Rat extends Cat{
    public String a;
    public int b;
    public Rat(String a,int b){
        super("Mewaw",100);
        this.a=a;
        this.b=b;
         
        
    }
    public void show(){
        super.show();
        System.out.println(a+" "+b);
        
    }
    
    public static void main(String[] args){
        Rat r1=new Rat("Rat",10);
        r1.show();
        
    }
    
}
