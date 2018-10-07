public class Fibonochhi {
    public static void main(String[] args){
        int n=5,first=0,second=1,third;
        System.out.println("The Fibonochhi Series");
        for(int i=0;i<n;i++){
            if(i<=1){
                third=i;
            }
            else{
                third=first+second;
                first=second;
                second=third;
            }
            System.out.print("\t"+third);
        }
        System.out.println();
    }
    
}
