import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Kapatma extends JFrame implements WindowListener{
	public Kapatma(String str) {
		setSize(200,222);
		setLayout(new FlowLayout());
		JTextArea text=new JTextArea(str);
		add(text);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void windowOpened(WindowEvent e) {		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}
	public void windowClosed(WindowEvent e) {		
	}	
	public void windowIconified(WindowEvent e) {	
	}
	public void windowDeiconified(WindowEvent e) {		
	}
	public void windowActivated(WindowEvent e) {		
	}
	public void windowDeactivated(WindowEvent e) {	
	}
}
