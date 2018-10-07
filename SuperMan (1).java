
package sakhhor.sir;

class Man{
    private int weight;
    public Man(int weight){
        this.weight=weight;
        
        
    }
    public void setWeight(int weight){
        if( weight>=50 && weight <=100){
            this.weight=weight;
        }
    }
    public int getWeight(){
        return weight;
    }
    public void show(){
        System.out.println(weight);
        
    }
    
}

public class SuperMan extends Man {
    public int power;
    
    public SuperMan(int power){
        super(55);
        this.power=power;
        
        
    }
    public SuperMan(int weight,int power){
        super (weight) ;
        this.power=power;
    }
    public void show(){
        super.show();
        System.out.println( power ) ;
    }
    public void show(String abc){
        System.out.println(abc);
    }
    public static void main(String[] args){
        SuperMan object = new SuperMan(10);
        object.show();
        SuperMan object1 = new SuperMan(50,100);
        object1.show("Programmer");
        Man object2 = new Man(100000);
        object2.setWeight(2);
        System.out.println("The Weight Returned  From Encapsulated Man Method Is : "+object2.getWeight());
        
    }
    
}
