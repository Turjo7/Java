
package sakhhor.sir;


public class StackByTurjo {
    
    int[] a = new int[10];
    public int top=-1;
    public static void main(String[] args){
        StackByTurjo obj = new StackByTurjo();
       int k= obj.push();
        while(k!=-1){
        System.out.println("POP: "+obj.pop());
        
    }
    }
    public int push(){
        int count=1;
        for(int i=0;i<10;i++){
            top++;
            a[top]=i*10;
            count++;
        }
        return count;
        
    }
    public int pop(){
        
        
        return a[--top];
        
    }
    
}
