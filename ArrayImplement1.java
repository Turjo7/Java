
package all.java.code.pkgfor.uiu.lab.by.turjo;


public class ArrayImplement1 {
    
    public static void main(String[] args){
        
        int array[][] = new int[3][3];
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=i*j+1;
                
            
          }
        
       }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
       
      
    }
    
}
