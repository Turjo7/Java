
package javabasiclevelcoding;


class Digit{
    public int number;
    public Digit(int number){
        this.number=number;
        System.out.println("The Digit :  "+number);
        
    }
    public int calulation(){
        int temporay = number;
        int sum=0;
        int modulus=0;
        while(temporay!=0){
            modulus=temporay%10;
            sum=sum+modulus;
            temporay=temporay/10;
        }
        
        return sum;
        
    }
    
}

public class Sum_Of_A_Digit {
    
    public static void main(String[] args){
        Digit object = new Digit(123);
        System.out.println("The Sum Of The Digit : "+object.calulation());
    }
    
}
