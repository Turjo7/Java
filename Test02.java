
public class Test02 {
    protected void methodA(int number){       
        if( number == 0 )
            return;
        else{
            methodA(number - 1);
            System.out.print(number + "\n");
           


        }
    }

    
    public static void main(String[] args){
       
     new Test02().methodA(3);
    }
   }

   