
public class TestExceptionB {
   
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            try{
                 sum += Integer.parseInt( args [i]) ;
            // Integer is the wrapper class
            //parseInt is a build in method,it will convet an string into integer
            }
            catch(NumberFormatException e){
                System.out.println("Index : "+i+ " is not integer . "+e) ;
                
            }
        }
    }
    
}
