//import java.io.*;
import java.io.File;   
import java.io.FileWriter; 
import java.io.IOException;   
import java.io.InputStreamReader; 
import java.io.PrintWriter; 


public class WriteFile 
{
    public static void main(String[] args)
    {
        String string;
        File file;  // Creating a file
        file = new File("D:","MyText.txt");
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferReader in = new BufferReader(isr);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.printf("Write Something: ");
            string = in.readline();
            out.print(string);
            in.close();
            isr.close();
            out.close();
            
            
        }
        catch(IOException ex)
        {
            System.out.println(ex);
            
        }
            
    }
    
}
