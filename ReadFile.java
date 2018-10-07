import java.io.*;
public class ReadFile 
{
    public static void main(String[] args)
    {
        String string;
        
        try 
        {
            File file = new File("D:","MyText.txt");
            BufferReader in = new BufferReader (new FileReader(file));
            string = in.readline();
            while(string!=null)
            {
                System.out.println("Read: "+string);
                string = in.readline();
            }
            in.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File Not Found");
        }
        catch(IOException ex)
        {
            System.out.println("Input Output Problem");
        }
    }
    
}
