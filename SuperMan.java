
package shipping;


class Man{
    public String name;
    public Man(String name){
        this.name=name;
        
    }
    public void show(){
        System.out.println(name);
    }
    
}
 class SuperMan extends Man{

   
     public SuperMan(){
         super("Apple");
//         this.name=name;
        
         
     }
     public static void main(String[] args){
         
         
     }
     public void show(){
         super.show();
//        System.out.println(name);
    }
     
     
    
}
