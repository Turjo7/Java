
import java.util.Scanner;


public class ScannerTest {
    
    public static void main(String[] args){
        Scanner s = new Scanner ( System . in ) ;
        System.out.println("Enter A Line");
        String str = s .next ( ) ; // it can take a word, if we use space than it will cause an error
        System.out.println ("your Have Entered : "+ str ) ;
        System.out.println("Enter An Integer");
        int num = s.nextInt ( ) ;
        System.out.println ("Inputted Number : "+num) ;
        s.close( ) ;  // closing the scanner
    }
    
}
