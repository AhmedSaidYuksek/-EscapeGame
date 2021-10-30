import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.util.Scanner;

import javax.naming.directory.SchemaViolationException;
import javax.swing.JFrame;

public class Main extends JFrame implements KeyListener{
	boolean control=true;	
	long point=0;
	int mavi_x=480 ,mavi_y=30;
	int yesil_x=480 ,yesil_y=480;
	int kirmizi_x=10 ,kirmizi_y=30;
	int turuncu_x=10 ,turuncu_y=480;
	int cisim_x=250 ,cisim_y=250;
	MyThreads mavi=new MyThreads(200,0,this);
	MyThreads yesil=new MyThreads(205,1,this);
	MyThreads kirmizi=new MyThreads(300,2,this);
	MyThreads turuncu=new MyThreads(425,3,this);	
	public Main(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setSize(500,500);
		setVisible(true);
		addKeyListener(this);
		point=System.currentTimeMillis();
		mavi.start();		
		yesil.start();		
		kirmizi.start();		
		turuncu.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.red);
		g.fillOval(kirmizi_x,kirmizi_y,10,10);
		g.setColor(Color.orange);
		g.fillOval(turuncu_x,turuncu_y,10,10);
		g.setColor(Color.blue);
		g.fillOval(mavi_x,mavi_y,10,10);
		g.setColor(Color.green);
		g.fillOval(yesil_x,yesil_y,10,10);
		g.setColor(Color.black);		
		g.fillOval(cisim_x,cisim_y,10,10);
		if((cisim_x==kirmizi_x&&cisim_y==kirmizi_y)||(cisim_x==turuncu_x&&cisim_y==turuncu_y)||(cisim_x==mavi_x&&cisim_y==mavi_y)||(cisim_x==yesil_x&&cisim_y==yesil_y)) {
			control=false;			
			point=System.currentTimeMillis()-point;
			point/=1000;										
			mavi.stop();
			turuncu.stop();
			yesil.stop();
			kirmizi.stop();
			Kapatma kapat=new Kapatma("Skorunuz: "+point);
		}
	}
	public void keyTyped(KeyEvent e) {					
	}	
	public void keyPressed(KeyEvent e) {				
	}	
	public void keyReleased(KeyEvent e) {			
		if(e.getKeyCode()==38&&cisim_y>30)cisim_y-=10;	
		else if(e.getKeyCode()==40&&cisim_y<480)cisim_y+=10;	
		else if(e.getKeyCode()==37&&cisim_x>10)cisim_x-=10;
		else if(e.getKeyCode()==39&&cisim_x<480)cisim_x+=10;			
		repaint();
	}
	public static void main(String[] args) {
		Main a=new Main();
	}
}
