
public class Test_Finally {
    public static void main(String[] args){
        try{
            int i=10/0;
            System.out.println(i);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e);
        }finally{
            System.out.println("Jodi Try Catch Naw Kaj Kor e , finally must kaj korbe");
            // finally will gonna work at any case , it is universal
        }
    }
    
}
