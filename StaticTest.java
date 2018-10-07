
package sakhhor.sir;


public class StaticTest {
    
    public static  int count=0;
    public StaticTest(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args){
        System.out.println("Count Called Using Class: "+StaticTest.count);
        StaticTest object1 = new StaticTest();  // Creating object once count= 1
        StaticTest object2 = new StaticTest();  // Creating object 2nd time count = 2
        StaticTest object3 = new StaticTest(); // Creating object 3rd time count = 3
        // Till this step count = 3 ; as it is static 
        System.out.println("Count Called Using Class: "+StaticTest.count); // Direct variable calling count =0
        System.out.println("Count Called Using object1: "+object1.count);
        System.out.println("Count Called Using object2: "+object2.count);
        System.out.println("Count Called Using object3: "+object3.count);
        object2.count=34;
        // The value of count is now 34, the previous value gone 
        System.out.println("Count Called Using object1: "+object1.count);
        System.out.println("Calling The getCount Method"+ " "+StaticTest.getCount());
        System.out.println("Calling The getCount Method By Using Object1"+" "+object1.getCount());
        System.out.println("Calling The getCount Method By Using Object2"+" "+object2.getCount());
        System.out.println("Calling The getCount Method By Using Object3"+" "+object3.getCount());
    }
    
    
}
