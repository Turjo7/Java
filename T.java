
package javabasiclevelcoding;


public class T {
    public int a;
     public int b;
      public int c;
    
    
    public void show(){
        System.out.println("Hello Java");
        
    }
    public void show(int a,int b){
        this.a=a;
        this.b=b;
       System.out.println(a+ b);
        
    }
    public int show(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
         return a+b+c;
    }
   
    public static void main(String[] args){
        T t = new T();
        t.show();
        t.show(2,5);
        int e =t.show(8,5,6);
        System.out.println(e);
    }
             
    
}
