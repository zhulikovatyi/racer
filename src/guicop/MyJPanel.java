//package guicop;
//
//import model.*;
//
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
//import guicop.*;
//
//
//public class MyJPanel extends JPanel implements ActionListener{
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private static final int SCALE = 5;
//	private static final int WIDTH = 100;
//	private static final int HEIGHT = 100;
//	private static final int SPEED = 1;
//	
//	
//	public MyJPanel(){
//		t.start();
//	}
//	
//    Racer r = new Racer(25,99,9,10);
//    
//    Racer r1 = new Racer(27,99,9,10);
//    
//    Racer r2 = new Racer(23,99,9,10);
//    
//    Racer r3 = new Racer(29,99,9,10);
//    
//    Border b = new Border(20,99);
//    
//    Timer t = new Timer(2000/SPEED,this);
//    
//	public void paint(Graphics g) {
//		g.setColor(color(255,255,255));
//		g.fillRect(0, 0, WIDTH*SCALE, HEIGHT*SCALE);
//		g.setColor(color(0,0,0));
//		
//		for(int x = 0; x <= WIDTH*SCALE ; x += SCALE) {
//			g.drawLine(x, 0, x, HEIGHT*SCALE);
//		}
//		for(int y = 0; y <= HEIGHT*SCALE ; y += SCALE) {
//			g.drawLine(0, y, WIDTH*SCALE, y);
//		}
//		for(int i = 0; i < r.lenght ; i++) {
//			g.setColor(color(224, 27, 27));
//			g.fillRect(r.raserX[i]*SCALE + 1, r.raserY[i]*SCALE + 1, SCALE - 1, SCALE - 1);
//		}
//		
//		for(int i = 0; i < r1.lenght ; i++) {
//			g.setColor(color(224, 27, 27));
//			g.fillRect(r1.raserX[i]*SCALE + 1, r1.raserY[i]*SCALE + 1, SCALE - 1, SCALE - 1);
//		}
//		
//		for(int i = 0; i < r2.lenght ; i++) {
//			g.setColor(color(224, 27, 27));
//			g.fillRect(r2.raserX[i]*SCALE + 1, r2.raserY[i]*SCALE + 1, SCALE - 1, SCALE - 1);
//		}
//		
//		for(int i = 0; i < r3.lenght ; i++) {
//			g.setColor(color(224, 27, 27));
//			g.fillRect(r3.raserX[i]*SCALE + 1, r3.raserY[i]*SCALE + 1, SCALE - 1, SCALE - 1);
//		}
//		for(int i = 0; i < 50  ; i++) {
//			g.setColor(color(0, 0, 0));
//			g.fillRect(b.borderX[i]*SCALE + 1, b.borderY[i]*SCALE + 1, SCALE - 1, SCALE - 1);
//		}
//	}
//	
//	public Color color(int red,int green,int blue) {
//		return new Color(red,green,blue);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent arg0) {
//		r.move();
//		r1.move();
//		r2.move_rascer();
//		r3.move();
//		repaint();
//		
//	}
//}
