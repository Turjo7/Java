
package javabasiclevelcoding;

class Test1{
    public int number;
    public Test1(int number){
        this.number=number;
    }
    public int display(){
        int factorial=1;
        if(number==0){
            return 1;
        }
        else{
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
        }
        return factorial;
    }
    
}


public class Factorial {
    
    public static void main(String[] args){
        Test1 object = new Test1(0);
        System.out.println("The Factorial Of "+object.number+" Is "+object.display());
    }
    
}
