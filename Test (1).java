
package sakhhor.sir;

class Person{
    public int NID;
     public String toString(){
        return "From Person";
    }
    
}
class Student extends Person{
    public int SID;
     public String toString(){
         super.toString();
        return "From Student";
    }
    
}
class Employee extends Person{
    public int Salary;
    public String toString(){
         super.toString();
        return "From Employee";
    }
    
    
}
class Faculty extends Employee{
    public String Rank;
     public String toString(){
          super.toString();
        return "From Faculty";
    }
    
}
class Staff extends Employee{
    public String Title;
     public String toString(){
          super.toString();
        return "From Staff";
    }
}
public class Test{
    public static void main(String[] args){
        
    }
    
}