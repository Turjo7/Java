
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.BoxLayout; 
public class TestDifferentLayouts implements WindowListener 
{ 
private Frame frame; 
private Panel[] panel; 
private Button[][] button; 
private TestDifferentLayouts() 
{ 
frame = new Frame("Test Different Layouts"); 
panel = new Panel[4]; 
for( int i = 0; i < panel.length; i++ ) 
{ 
panel[i] = new Panel(); 
} 
button = new Button[4][4]; 
for( int counter = 1, i = 0; i < button.length; i++ ) 
{ 
for( int j = 0; j < button[i].length; j++ ) 
{ 
button[i][j] = new Button("Button " + counter); 
button[i][j].setFont( new Font("Consolas", Font.PLAIN, 16) ); 
counter++; 
} 
} 
} 
private void show() 
{ 
panel[0].setBackground(Color.ORANGE); 
panel[0].setLayout( new FlowLayout() ); 
panel[0].add(button[0][0]); 
panel[0].add(button[0][1]); 
panel[0].add(button[0][2]); 
panel[0].add(button[0][3]); 


panel[1].setBackground(Color.GREEN); 
panel[1].setLayout( new BorderLayout() ); 
panel[1].add(button[1][0], BorderLayout.NORTH); 
panel[1].add(button[1][1], BorderLayout.SOUTH); 
panel[1].add(button[1][2], BorderLayout.EAST); 
panel[1].add(button[1][3], BorderLayout.WEST); 
panel[2].setBackground(Color.BLUE); 
panel[2].setLayout( new BoxLayout(panel[2], BoxLayout.X_AXIS) ); 
//panel[2].setLayout( new BoxLayout(panel[2], BoxLayout.Y_AXIS) ); 
panel[2].add(button[2][0]); 
panel[2].add(button[2][1]); 
panel[2].add(button[2][2]); 
panel[2].add(button[2][3]); 
panel[3].setBackground(Color.YELLOW); 
panel[3].setLayout( new GridLayout(2, 2, 10, 20) ); 
panel[3].add(button[3][0]); 
panel[3].add(button[3][1]); 
panel[3].add(button[3][2]); 
panel[3].add(button[3][3]); 
frame.add(panel[0]); 
frame.add(panel[1]); 
frame.add(panel[2]); 
frame.add(panel[3]); 
frame.addWindowListener(this); 
frame.setLayout( new GridLayout(2, 2, 10, 10) ); 
frame.setBackground(Color.MAGENTA); 
frame.setSize(800, 800); 
frame.setResizable(true); 
frame.setVisible(true); 
} 
@Override 
public void windowActivated(WindowEvent e) 
{ 
} 
@Override 
public void windowClosed(WindowEvent e) 
{ 
} 
@Override 
public void windowClosing(WindowEvent e) 
{ 
System.exit(0); 
} 


@Override 
public void windowDeactivated(WindowEvent e) 
{ 
} 
@Override 
public void windowDeiconified(WindowEvent e) 
{ 
} 
@Override 
public void windowIconified(WindowEvent e) 
{ 
} 
@Override 
public void windowOpened(WindowEvent e) 
{ 
} 
public static void main(String[] args) 
{ 
TestDifferentLayouts testLayouts = new TestDifferentLayouts(); 
testLayouts.show(); 
} 
} 

