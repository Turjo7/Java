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
public class TestCode {
    public  int number;
    public TestCode(){

        number++;
       
    
}
    {
        number++;
    }
    
    public void display(){
        System.out.println(number);
    }
    public static void main(String[] args){
        
        TestCode obj = new TestCode();
        obj.display();
        
    }
    
}
