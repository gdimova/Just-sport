

import javax.swing.*;

import java.awt.*;
public class Izbor extends JApplet implements Runnable {
 
	Thread nitka;
	int poc;
	public void init(){
		setSize(235,230);
		nitka=new Thread(this);
		nitka.start();
		poc=85;
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel li=new JLabel("НАПРАВЕТЕ ГО НАЈДОБРИОТ ИЗБОР !!!.");
		panel.add(li,BorderLayout.SOUTH);
		getContentPane().add(panel);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.blue);
		g.fillArc(0, 0, 200, 200, 0, 360);
		
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 160, 160, 0, 360);
		
		g.setColor(Color.black);
		g.fillArc(0, 0, 200, 200, poc, 3);
	}
	public void run(){
		while(true){
			poc-=10;
			repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
		
	}

