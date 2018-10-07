/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.java.code.pkgfor.uiu.lab.by.turjo;

/**
 *
 * @author nasir uddin ahmed
 */
public class MDA {
    
    public static void main(String[] args){
        
        int[][] a = new int [3][];
        
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[5];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=100*2+j+i;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
