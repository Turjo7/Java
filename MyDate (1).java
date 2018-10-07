
public class MyDate {
    
    private int date;
    private int month;
    private int year;
    
   MyDate(){
        date = 17;
        month = 10;
        year = 2015;
        
    }
    
    public static void main(String[] args){
        
        MyDate object = new MyDate(  );
        object.show();
    }
    public void show(){
        System.out.println("Date- "+date);
        System.out.println("Month- "+month);
        System.out.println("Year- "+year);
        
    }
    
}
