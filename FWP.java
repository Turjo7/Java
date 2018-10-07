
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class FWP implements WindowListener
{
    private Frame frame;
    private Panel panel;
    public FWP()
    {
        frame = new Frame("Frame With Panel");
        panel = new Panel();
        
        
    }
    public void show()
    {
        frame.addWindowListener(this);
        frame.setSize(800,600);
        frame.setBackground(Color.ORANGE);
        frame.setLayout(null);
        
        panel.setSize(300,200);
        panel.setBackground(Color.MAGENTA);
        
        frame.add(panel);
        frame.setResizable(true);
        frame.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        FWP fwp = new FWP();
        fwp.show();
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
