
public class Welcome {
    public static void main(String[] args){
        for(int i=1; i<=20 ; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+"-UIU");
            }
            else{
                if(i%5==0){
                    System.out.println(i+"-JAVA");
                    
                }
                else{
                    if(i%3==0){
                        System.out.println(i+"-CSE");
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }
        }
    }
    
}
