
import java.awt.*; 
import java.awt.event.*; 
public class MouseListenerExample implements WindowListener, MouseListener 
{ 
private Frame frame; 
private TextField textField; 
public MouseListenerExample() 
{ 
frame = new Frame("MouseListener Example"); 
textField = new TextField(30); 
} 
private void show() 
{ 
Label label = new Label("This is a label"); 
label.setFont( new Font("Consolas", Font.PLAIN, 20) ); 
label.setAlignment(Label.CENTER); 
//label.setAlignment(Label.LEFT); 
//label.setAlignment(Label.RIGHT); 
textField.setEditable(false); 
textField.setFocusable(false); 
textField.setFont( new Font("Consolas", Font.PLAIN, 16) ); 
frame.setLayout( new BorderLayout() ); 
frame.add(label, BorderLayout.NORTH); 
frame.add(textField, BorderLayout.SOUTH); 
frame.addWindowListener(this); 
frame.addMouseListener(this); 
frame.setSize(800, 600); 
frame.setResizable(true); 
frame.setBackground(Color.ORANGE); 
frame.setVisible(true); 
} 
@Override 
public void mouseClicked(MouseEvent e) 
{ 
String string = "Mouse clicked at: " + e.getX() + ", " + e.getY(); 
textField.setText(string); 
} 


@Override 
public void mouseEntered(MouseEvent e) 
{ 
String string = "Mouse entered the frame"; 
textField.setText(string); 
} 
@Override 
public void mouseExited(MouseEvent e) 
{ 
String string = "Mouse left the frame"; 
textField.setText(string); 
} 
@Override 
public void mousePressed(MouseEvent e) 
{ 
String string = "Mouse pressed at: " + e.getX() + ", " + e.getY(); 
textField.setText(string); 
} 
@Override 
public void mouseReleased(MouseEvent e) 
{ 
String string = "Mouse released at: " + e.getX() + ", " + e.getY(); 
textField.setText(string); 
} 
@Override 
public void windowActivated(WindowEvent arg0) 
{ 
} 
@Override 
public void windowClosed(WindowEvent arg0) 
{ 
} 
@Override 
public void windowClosing(WindowEvent arg0) 
{ 
System.exit(0); 
} 


@Override 
public void windowDeactivated(WindowEvent arg0) 
{ 
} 
@Override 
public void windowDeiconified(WindowEvent arg0) 
{ 
} 
@Override 
public void windowIconified(WindowEvent arg0) 
{ 
} 
@Override 
public void windowOpened(WindowEvent arg0) 
{ 
} 
public static void main(String[] args) 
{ 
MouseListenerExample object = new MouseListenerExample(); 
object.show(); 
} 
} 

