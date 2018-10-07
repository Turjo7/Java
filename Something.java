
public class Something {
    
    public static void main(String[] args){
      Rectangle object = new Rectangle();
        object.width=40;
        object.height=50;
        System.out.println("The Area Is :"+object.getArea());
    }
    
}
class Rectangle{
    public int width;
    public int height;
    
    public int getArea(){
        
        return width*height;
    }
}
