
package javabasiclevelcoding;


public class TestStatic {
    
    
    /* kono method jodi static hoy ,
    othoba kono variable static hoil e object create korte hoy na.
    static variable , non static method er vitor use kra jay na.
    static man  e  single copy create kra memory te
    
    
    */
     
    public static int count;
    public static void incrementcount(){
        count++;
    }
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            System.out.println("Count Is : "+TestStatic.count);
            TestStatic.incrementcount();  
                                      
        }
    }
}
