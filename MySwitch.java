
public class MySwitch {
    
    public void switchTest(int x){
        
        switch(x){
            case 1:
                System.out.println("Shakib Al Hasan");
               // break;
            case 2:
                System.out.println("Tamim Iqbal");
               break;
            case 3:
                System.out.println("Mashrafe");
                break;
            default:
                System.out.println("Wrong Input");
        }
        
        
    }
    
    public static void main(String[] args){
        MySwitch obj = new MySwitch();
        obj.switchTest(1);
        
    }
    
}
