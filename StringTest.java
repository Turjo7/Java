
package sakhhor.sir;


public class StringTest {

    
    public static void main(String[] args) {
        String x = "Java";
        String y= x;
        System.out.println("y string = "+y);
        x=x+ "Bean";
        // y=x;    // not updated so , y will print the previous value
        System.out.println("y string = "+y);
    }
    
}
