
package sakhhor.sir;

class StackTest{
     public void main(String[] args){
        Stack obj = new Stack(100);
   
    for(int i=0;i<10;i++){
    obj.push(i);
}
    while(!obj.isEmpty()){
        System.out.println("Elements: "+obj.pop());
        
    }
     }
}
public class Stack {
    public int array[];
    public int size;
    
    public Stack(int size){
        array= new int[size];
    }
    
    public void push(int e){
        array[size++]=e;
    }
    public int pop(){
        return array[--size];
    }
    public boolean isFull(){
        return size == array.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public static void main(String[] args){
        
    }
    
}


