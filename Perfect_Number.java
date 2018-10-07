
package javabasiclevelcoding;

class Test0075{
    public int n=6;
    public int i=1;
    public int sum=0;
    public void show(){
//     int n=6,sum=0,i=1;
        while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
  }
  if(sum==n)
      System.out.println("Perfect Number");
  else
    System.out.println("Not Perfect Number");
   }
}

public class Perfect_Number {
    public static void main(String[] args){
        Test0075 object = new Test0075();
        object.show();
    


}
       
    }
    

