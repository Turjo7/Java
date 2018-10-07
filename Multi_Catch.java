
public class Multi_Catch {
    
    public static void main(String[] args){
        try{
            int i = 10/0;
            System.out.println(i);
        }catch(ArithmeticException e1){
            System.out.println("Arithmectic Exception. "+e1);   // code will execute this statement
        }catch(Exception e2){
            System.out.println("Exception. "+e2);
        }
        
    }
    
}
