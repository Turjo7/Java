
public class Prime_Number {
    public int a;
    public Prime_Number(int a){
        this.a=a;
        
    }
    public void prime_number_test(){
        int flag=0;
        for(int i=2 ; i<=a/2 ; i++){
            if(a%i==0){
                flag=1;
                
            }
        }
    }
    
    public static void main(String[] args){
      Prime_Number object = new Prime_Number(5);  
      object.prime_number_test();
    }
    
}
