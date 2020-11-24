
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Troca {
	JFrame frame = new JFrame("Troca");
	JPanel panel = new JPanel();
	JLabel back = new JLabel(new ImageIcon(getClass().getResource("assets/images.png")));
	JLabel e1 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel e2 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel e3 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel e4 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p1 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel p2 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel p3 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel p4 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e5 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p5 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e6 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p6 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e7 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p7 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	JLabel e8 = new JLabel(new ImageIcon(getClass().getResource("assets/e1.png")));
	JLabel p8 = new JLabel(new ImageIcon(getClass().getResource("assets/p1.png")));
	
	public Troca() {
		frame.setVisible(true);
		//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frame.setSize(600,320);
			frame.setLocationRelativeTo(null);
			frame.setLayout(null);
			back.setBounds(0, 0, 600, 320);
		
			e1.setBounds(40, 40, 15, 15);
			e2.setBounds(500, 250, 15, 15);
			
			p1.setBounds(450, 40, 15, 15);
			p2.setBounds(40, 200, 15, 15);
			
			e3.setBounds(504, 75, 15, 15);
			p3.setBounds(65, 170, 15, 15);
			
			e4.setBounds(110, 94, 15, 15);
			p4.setBounds(150, 140, 15, 15);
			
			e5.setBounds(500, 135, 15, 15);
			p5.setBounds(532, 150, 15, 15);
			
			e6.setBounds(110, 250, 15, 15);
			p6.setBounds(525, 230, 15, 15);
			
			e7.setBounds(520, 222, 15, 15);
			p7.setBounds(105, 80, 15, 15);
			
			e8.setBounds(110, 120, 15, 15);
			p8.setBounds(420, 200, 15, 15);
			
			
			new Thread(){
				public void run() {
					int p2X, p2Y,p3X,p4X,p7X,p3Y,p4Y,p7Y,e2X, e2Y,e3X,e5X,e7X,e3Y,e5Y,e7Y;
					p2X = p2.getLocation().x;
					p2Y = p2.getLocation().y;
					
					e2X = e2.getLocation().x;
					e2Y = e2.getLocation().y;
					
					p3X = p3.getLocation().x;
					p4X = p4.getLocation().x;
					p7X = p7.getLocation().x;
					p3Y = p3.getLocation().y;
					p4Y = p4.getLocation().y;
					p7Y = p7.getLocation().y;
					
					e3X = e3.getLocation().x; 
					e5X = e5.getLocation().x;
					e7X = e7.getLocation().x;
					e3Y = e3.getLocation().y;
					e5Y = e5.getLocation().y;
					e7Y = e7.getLocation().y;
					while(p2.getLocation().x < 500 && e2.getLocation().x > 10 
							&& p3.getLocation().x < 500 && e3.getLocation().x > 10 
							&& p4.getLocation().x < 500 && e5.getLocation().x > 10 
							&& p7.getLocation().x < 500 && e7.getLocation().x > 10 
							) {
						p2X++;  
						e2X--; 
						p3X++;  
						e3X--; 
						p4X++;  
						e5X--; 
						p7X++;  
						e7X--; 
						p2.setLocation(p2X, p2Y);
						e2.setLocation(e2X, e2Y);
						
						p3.setLocation(p3X, p3Y);
						e3.setLocation(e3X, e3Y);
						p4.setLocation(p4X, p4Y);
						e5.setLocation(e5X, e5Y);
						p7.setLocation(p7X, p7Y);
						e7.setLocation(e7X, e7Y);
						
						try {
							sleep(10);
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					try {
						sleep(500);
						frame.dispose();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}.start();
			frame.add(e1);
			frame.add(e2);
			
			frame.add(p1);
			frame.add(p2);
			
			frame.add(e3);
			frame.add(e4);
			
			frame.add(p3);
			frame.add(p4);
			
			frame.add(e5);
			frame.add(p5);
			
			frame.add(e6);
			frame.add(p6);
			
			frame.add(e7);
			frame.add(p7);	
			frame.add(e8);
			frame.add(p8);
			frame.add(back);
			}
	



}
