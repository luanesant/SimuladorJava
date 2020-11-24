import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Sim {
	public JFrame  frame = new JFrame("Simulator");
	ImageIcon bastaoImg = new ImageIcon(getClass().getResource("assets/bastaao.png"));
	JLabel bastao = new JLabel(bastaoImg);
	ImageIcon meiaImg = new ImageIcon(getClass().getResource("assets/meia.png"));
	JLabel meia = new JLabel(meiaImg);
	ImageIcon e1Img = new ImageIcon(getClass().getResource("assets/e1.png"));
	ImageIcon e2Img = new ImageIcon(getClass().getResource("assets/e1.png"));
	ImageIcon e3Img = new ImageIcon(getClass().getResource("assets/e1.png"));
	ImageIcon e4Img = new ImageIcon(getClass().getResource("assets/e1.png"));
	ImageIcon p1Img = new ImageIcon(getClass().getResource("assets/p1.png"));
	ImageIcon p2Img = new ImageIcon(getClass().getResource("assets/p1.png"));
	ImageIcon p3Img = new ImageIcon(getClass().getResource("assets/p1.png"));
	ImageIcon p4Img = new ImageIcon(getClass().getResource("assets/p1.png"));
//	ImageIcon eletrized = new ImageIcon(getClass().getResource("assets/eletrized.png"));
	Main mainF = new Main();

	
	JPanel panel = new JPanel();
	JLabel e1 = new JLabel(e1Img);
	JLabel e2 = new JLabel(e2Img);
	JLabel e3 = new JLabel(e3Img);
	JLabel e4 = new JLabel(e4Img);
	JLabel p1 = new JLabel(p1Img);
	JLabel p2 = new JLabel(p2Img);
	JLabel p3 = new JLabel(p3Img);
	JLabel p4 = new JLabel(p4Img);
	JLabel e5 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p5 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e6 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p6 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e7 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p7 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e8 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p8 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel fundo = new JLabel(new ImageIcon(getClass().getResource("assets/fundo.jpeg")));

	JMenuBar menuBar = new JMenuBar();
    JMenu mainMenu = new JMenu("Principal");
    JMenu simMenu = new JMenu("Simulador");
    JMenuItem eletrized = new JMenuItem("Eletrização");   
    JButton reset = new JButton(new ImageIcon(getClass().getResource("assets/reset.png")));		
    JButton exit = new JButton(new ImageIcon(getClass().getResource("assets/exit.png")));		

	
	boolean bateu = false;
	boolean mousePressionado= false;
	boolean cDireita=false;
	boolean cCima=false;
	boolean cBaixo=false;
	boolean cEsquerda=false;
	
       
	public Sim() {
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(1020,750);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		new Mover().start();
		
		panel.setLayout(null);
		panel.setBounds(700, 50, 278, 200);
		panel.setBackground(new Color(255,255,255,0));
		panel.setOpaque(false);
		reset.setBounds(750, 450, 100, 100);
		exit.setBounds(900, 450, 100, 100);

		fundo.setBounds(0, 0, 1112, 750);
		bastao.setBounds(0, 0, 278, 198);
		meia.setBounds(40, 40, 290, 347);
		e1.setBounds(70, 60, 15, 15);
		e2.setBounds(290, 250, 15, 15);
		p1.setBounds(200, 40, 15, 15);
		p2.setBounds(140, 200, 15, 15);
		
		e5.setBounds(265, 100, 15, 15);
		p5.setBounds(130, 290, 15, 15);
		e6.setBounds(120, 200, 15, 15);
		p6.setBounds(280, 230, 15, 15);
		
		
		e3.setBounds(40, 40, 15, 15);
		p3.setBounds(65, 70, 15, 15);
		e4.setBounds(100, 70, 15, 15);
		p4.setBounds(65, 40, 15, 15);
	
		e7.setBounds(20,35, 15, 15);
		p7.setBounds(85, 80, 15, 15);
		
		e8.setBounds(110, 75, 15, 15);
		p8.setBounds(100, 60, 15, 15);
		reset.setBorderPainted(false); 
		reset.setContentAreaFilled(false);
		reset.setFocusPainted(false);
		exit.setBorderPainted(false); 
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		actions();
		frame.add(e1);
		frame.add(e2);
		frame.add(p1);
		frame.add(p2);
		frame.add(e5);
		frame.add(p5);
		frame.add(e6);
		frame.add(p6);
		frame.add(reset);
		panel.add(e3);
		panel.add(e4);
		panel.add(p3);
		panel.add(p4);
		panel.add(e7);
		panel.add(p7);
		panel.add(e8);
		panel.add(p8);
		
		frame.add(exit);

		panel.add(bastao);
		frame.add(panel);
		frame.add(meia);
		frame.add(fundo);
	}
	public void addComp() {
		new Mover().start();

		panel.setLayout(null);
		panel.setBounds(700, 50, 278, 200);
		panel.setBackground(new Color(255,255,255,0));
		panel.setOpaque(false);
		
		 e1.setIcon(e1Img);
		 e2.setIcon(e2Img);
		 e3.setIcon(e3Img);
		 e4.setIcon(e4Img);
		 p1.setIcon(p1Img);
		 p2.setIcon(p2Img);
		 p3.setIcon(p3Img);
		 p4.setIcon(p4Img);
		 e5.setIcon(new ImageIcon(getClass().getResource("assets/e1.png")));
		 p5.setIcon(new ImageIcon(getClass().getResource("assets/p1.png")));
		 e6.setIcon(new ImageIcon(getClass().getResource("assets/e1.png")));
		 p6.setIcon(new ImageIcon(getClass().getResource("assets/p1.png")));
		 e7.setIcon(new ImageIcon(getClass().getResource("assets/e1.png")));
		 p7.setIcon(new ImageIcon(getClass().getResource("assets/p1.png")));
		 e8.setIcon(new ImageIcon(getClass().getResource("assets/e1.png")));
		 p8.setIcon(new ImageIcon(getClass().getResource("assets/p1.png")));
 
		reset.setBounds(750, 450, 100, 100);
		exit.setBounds(900, 450, 100, 100);

		fundo.setBounds(0, 0, 1112, 750);
		bastao.setBounds(0, 0, 278, 198);
		meia.setBounds(40, 40, 290, 347);
		e1.setBounds(40, 40, 15, 15);
		e2.setBounds(290, 250, 15, 15);
		p1.setBounds(200, 40, 15, 15);
		p2.setBounds(40, 270, 15, 15);
		
		e5.setBounds(265, 100, 15, 15);
		p5.setBounds(120, 270, 15, 15);
		e6.setBounds(80, 250, 15, 15);
		p6.setBounds(280, 230, 15, 15);
		
		
		e3.setBounds(40, 40, 15, 15);
		p3.setBounds(65, 70, 15, 15);
		e4.setBounds(100, 70, 15, 15);
		p4.setBounds(65, 40, 15, 15);
	
		e7.setBounds(20,35, 15, 15);
		p7.setBounds(85, 80, 15, 15);
		
		e8.setBounds(110, 75, 15, 15);
		p8.setBounds(100, 70, 15, 15);
		
		
		
		reset.setBorderPainted(false); 
		reset.setContentAreaFilled(false);
		reset.setFocusPainted(false);
		exit.setBorderPainted(false); 
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		actions();
		frame.add(e1);
		frame.add(e2);
		frame.add(p1);
		frame.add(p2);
		frame.add(e5);
		frame.add(p5);
		frame.add(e6);
		frame.add(p6);
		frame.add(reset);
		panel.add(e3);
		panel.add(e4);
		panel.add(p3);
		panel.add(p4);
		panel.add(e7);
		panel.add(p7);
		panel.add(e8);
		panel.add(p8);
		
		frame.add(exit);

		panel.add(bastao);
		frame.add(panel);
		frame.add(meia);
		frame.add(fundo);
	}
	public void actions() {
		panel.addMouseListener(new MouseListener() {	
			@Override
			public void mouseReleased(MouseEvent arg0) {
				mousePressionado = false;
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				mousePressionado = true;
			}			
			@Override
			public void mouseExited(MouseEvent arg0) {
			}			
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}			
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				mainF.mainFrame.setVisible(true);
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//	frame.removeAll();
				addComp();
				
			}
		});
	}
	
	public void sizes() {
	
		 e1.setIcon(e1Img);
		 e2.setIcon(e1Img); 
		 e3.setIcon(p1Img); 
		 e4.setIcon(p1Img); 
		 p1.setIcon(e1Img); 
		 p2.setIcon(e1Img); 
		 p3.setIcon(p1Img); 
		 p4.setIcon(p1Img); 
		 e5.setIcon(e1Img);
		 p5.setIcon(e1Img); 
		 e6.setIcon(e1Img);
		 p6.setIcon(e1Img);
		 e7.setIcon(p1Img);
		 p7.setIcon(p1Img);
		 e8.setIcon(p1Img);
		 p8.setIcon(p1Img); 
		
	
	}
	public boolean collision(Component a, Component b) {
		int aX = a.getX();
		int aY = a.getY();
		int ladoDireitoA = aX+a.getWidth();
		int ladoEsquerdoA= aX;
		int ladoBaixoA= aY+a.getHeight();
		int ladoCimaA= aY;
		
		int bX = b.getX();
		int bY = b.getY();
		int ladoDireitoB = bX+b.getWidth();
		int ladoEsquerdoB= bX;
		int ladoBaixoB= bY+b.getHeight();
		int ladoCimaB= bY;
		
		if(ladoDireitoA>=ladoEsquerdoB) {
			cDireita=true;
		}
		if(ladoCimaA<=ladoBaixoB) {
			cCima=true;
		}
		if(ladoBaixoA>=ladoCimaB) {
			cBaixo=true;
		}
		if(ladoEsquerdoA<=ladoDireitoB) {
			cEsquerda=true;
		}
		
		if(cDireita && cEsquerda && cBaixo && cCima) {
			bateu = true;
		}
			
		return bateu;
	
	}
	public class Mover extends Thread{
		public void run() {
			
			while(true) {
				try {sleep(10);} catch (Exception e) {}
				if (mousePressionado) {
					PointerInfo ponto = MouseInfo.getPointerInfo();
					Point point = ponto.getLocation();
					panel.setBounds(point.x-250, point.y-90,540, 500);
					}
				
				if(collision(meia,panel) == true) {
					
				
					try { 
						
						Thread.sleep (10);
						new Troca();
						sizes();
					bateu = false;  
					 cDireita=false;
					 cCima=false;
					 cBaixo=false;
					 cEsquerda=false;
					
					
					 } catch (InterruptedException ex) {}
					break;
					
				}
				}
		}
	
	}
	
}
