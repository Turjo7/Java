
package sakhhor.sir;


public class Random_Number {
    public static void main(String[] args){
        int max=100;
        int min=12;
       int randomNum = min + (int)(Math.random() * max);
       System.out.println("Random Number Generated : "+randomNum );
    }
    
}
