
package all.java.code.pkgfor.uiu.lab.by.turjo;


public class TestCode1 {
    public static void main(String[] args){
        int x=10;
        int y=10;
        
        for(int i=0;i<5;i++){
            if(++x<420 || ++y<420)
                x++;
            System.out.println(x+" "+y);
        }
    }
    
}
