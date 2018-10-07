
public class TestExceptionA {
    public static void main(String[] args){
        int sum=0;
        
        for ( int i =0; i<args.length ; i++){
            sum += Integer.parseInt( args [ i ] ) ;
            // Integer is the wrapper class
            //parseInt is a build in method,it will convet an string into integer
            
        }
        System.out.println("Sum: " + sum) ;
    }
    
}
