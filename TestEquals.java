
package sakhhor.sir;



public class TestEquals {
    public int x;
    public int y;
    
    public TestEquals(int x,int y){
        this.x=x;
        this.y=y;
        
        
    }
    public boolean equals(Object obj){
        boolean result = false;
        if((obj!=null)&&(obj instanceof TestEquals)){
            TestEquals t = (TestEquals) obj; // casting
            if((x==t.x)&&(y==t.y)){
                result=true;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
        
        TestEquals t1 = new TestEquals(6,10);
        TestEquals t2 = new TestEquals(5,10);
        if(t1==t2){
            System.out.println("t1 is identical to t2");
        }
        else{
            System.out.println("t1 is not identical to t2");
        }
        if(t1.equals(t2)){
            System.out.println("t1 is equal to t2");
        }
        else{
            System.out.println("t1 is not equal to t2");
        }
        t2=t1;
        if(t1==t2){
            System.out.println("t1 is identical to t2");
        }
        else{
            System.out.println("t1 is not identical to t2");
            
        }
        
    }
}
