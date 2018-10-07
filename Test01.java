public class Test01 {
    private int number = 5;
 private Test01()
 {
     number = (int) Math.sqrt(number);
    
}
 {
    number = 10;
 }
    
    
    public static void main(String[] args){
        Test01 t1 = new Test01(); 
        System.out.println( t1.number );
    }
}
