
package sakhhor.sir;

class Bank{
    int getRateofInterest(){
        return 0;
    }
    
}

class Dutch_Bangla_Bank extends Bank{
     int getRateofInterest(){
        return 7;
    }
    
}
class UCB_Bank extends Bank{
     int getRateofInterest(){
        return 12;
    }
    
}
        
class Bank_Asia extends Bank{
     int getRateofInterest(){
        return 20;
    }
    
}
public class Test_Polymorphism {
    public static void main(String[] args){
        Bank obj1 = new Dutch_Bangla_Bank();
        Bank obj2 = new UCB_Bank();
        Bank obj3 = new Bank_Asia();
        System.out.println("Interest Rate Of Dutch Bangla Bank: "+obj1.getRateofInterest());
        System.out.println("Interest Rate Of Dutch Bangla Bank: "+obj2.getRateofInterest());
        System.out.println("Interest Rate Of Dutch Bangla Bank: "+obj3.getRateofInterest());
    }
    
}
