
public class PrimeNumber {
    
    public static void main(String[] args){
        int num=4,count=0;
        for(int i=2 ; i<=num/2; i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0 && num!= 1){
            System.out.println(num+" " +"Is A Prime Number");
        }
        else{
            System.out.println(num +" " + "Is Not A Prime Number");
        }
        
        
    }
    
}
