
package Date;


public class MyDate {
    
    private int date; // Veriable declaration
    private int month; // Veriable declaration
    private int year; // Veriable declaration
    
    public MyDate(){
        date = 17;  //Initialize 
        month = 10; // Initialize
        year = 2016; // Initialize
                
        
    }
    public void show(){
        System.out.println("Date-"+date); // Printing Statement
        System.out.println("Month-"+month); // Printing Statement
        System.out.println("Year-"+year); // Printing Statement
    }
    public static void main(String[] args){
        
        MyDate object = new MyDate();  // Constructor calling 
        object.show(); // Calling show method by using the object of MyDate class
        
    }
    
}
