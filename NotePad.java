
package awt;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Random;


public class NotePad implements WindowListener,ActionListener{
    
    private Frame f;
    private MenuBar mb;
    private Menu m1,m2;
    private MenuItem mi1,mi2,mi3,mi4;
    private TextArea ta;
    private Random random;
    
    public NotePad(){
        
        f = new Frame("NotePad");
        
        mb = new MenuBar();
        ta = new TextArea();
        
        m1 = new Menu("File");
        m2 = new Menu("Help");
        
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi2.setActionCommand("save");
        mi3 = new MenuItem("Quit");
        mi3.setActionCommand("exit");
        mi4 = new MenuItem("Change The Color");
        mi4.setActionCommand("change");
        
        random = new Random();
        
    }
    public void show(){
        f.addWindowListener(this);
        f.setSize(600,600);
        ta.setSize(1000,1000);
        ta.setBackground(Color.BLUE);
        ta.setForeground(Color.black);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m2.add(mi4);
        mb.add(m1);
        mb.add(m2);
        f.setMenuBar(mb);
        f.setLayout(new FlowLayout());
        
        f.add(ta);
        f.setVisible(true);
    }
    public static void main(String[] args){
        NotePad object = new NotePad();
        object.show();
    }
    
    public static void saveFile(){
        
        File file = new File("D:","New Text Document.txt");
        
        try{
           
           InputStreamReader isr = new InputStreamReader(System.in);
           BufferedReader in = new   BufferedReader(isr);
               
            PrintWriter out = new PrintWriter(new FileWriter(file));
            String str = in.readLine();
            out.println(str);
            in.close();
            out.close();
         
        
            
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        
    }
    
    
    

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
      
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
      
    }

    @Override
    public void windowActivated(WindowEvent e) {
       
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int R;
        int G;
        int B;
        
        if(e.getActionCommand()=="exit"){
            System.exit(0);
        }
        if(e.getActionCommand()=="change"){
            
            R = random.nextInt(256);
            G = random.nextInt(256);
            B = random.nextInt(256);
            
            Color color = new Color(R,G,B);
            f.setBackground(color);
            
           
            
        }
        if(e.getActionCommand()=="save"){
            
            NotePad.saveFile();
        }
 
    }
    
}




