
package javabasiclevelcoding;


public class T1 {
    public int a;
    public int b;
    public int c;
    public T1(){
        
    }
    
    public T1(int a,int b){
        this.a=a;
        this.b=b;
        
    }
    public T1(int a,int b ,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void show(){
        System.out.println(a+" "+ b+" " + c);
    }
    public static void main(String[] args){
        T1 o = new T1();
        o.show();
        T1 o1 =new T1(5,6);
        o1.show();
        T1 o2 = new T1(56,78,86);
        o2.show();
    }
    
}
