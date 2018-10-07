/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasiclevelcoding;

/**
 *
 * @author nasir uddin ahmed
 */
public class True_False {
    public boolean a;
    public boolean b;
    
    public True_False(boolean a,boolean b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        if(a==true&&b==true){
            System.out.println("Shakib Is The Best All-Rounder");
        }
        else{
            if(a==true&&b==false){
                System.out.println("Shakib Scored A 100");
                
            }
            else{
                if(a==false&&b==true){
                    System.out.println("Shakib Took 5 Wickets");
                }
                else{
                    if(a==false&&b==false){
                        System.out.println("Turjo Is Not As Good As Shakib");
                    }
                }
            }
        }
        
    }
    public static void main(String[] args){
        True_False obj = new True_False(false,false);
         obj.display();
        True_False obj1 = new True_False(false,true);
        obj1.display();
     
    }
    
}
