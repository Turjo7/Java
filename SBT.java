
package sakhhor.sir;


public class SBT {
    public static int myVar=0;
    static{
        setmyVar(10);
        System.out.println("In Static Block");
    }
    public static void setmyVar(int mv){
        myVar=mv;
    }
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
