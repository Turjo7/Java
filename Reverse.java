
package javabasiclevelcoding;

class Test{
    public int number;
    public Test(int number){
        this.number=number;
        System.out.println("The Number To Be Reversed: "+number);
    }
    public int display_reverse(){
        int reverse=0;
        while(number!=0){
            reverse=(reverse*10)+(number%10);
            number=number/10;
        }
        
        return reverse;
    }
   
    
}


public class Reverse {
    
    public static void main(String[] args){
        Test object = new Test(123456);
        System.out.println("The Reversed Number: "+object.display_reverse());
    }
}
