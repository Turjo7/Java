
package sakhhor.sir;


public class Selection_Sort {
    public static void main(String[] args){
         int[] a = {85,62,78,62,96,75};
        System.out.println("The Array Before Sorting");
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
		int min=i;
		for(int j=i+1;j<a.length;j++){
			if(a[min]>a[j]){
				min=j;
		}
	}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;


	}
         System.out.println("The Array After Selection Sort");
        for(int element:a){
            System.out.print(element+" ");
        }
    }
    
}
