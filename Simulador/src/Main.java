
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
public class Main {
	public static JFrame mainFrame = new JFrame("Simulator");
	JMenuBar menuBar = new JMenuBar();
    JMenu mainMenu = new JMenu("Principal");
    JMenu simMenu = new JMenu("Simulador");
    JMenuItem eletrized = new JMenuItem("Eletrização");
    JLabel fundo = new JLabel(new ImageIcon(getClass().getResource("assets/fundo.jpeg")));
	boolean bateu = false;
	boolean mousePressionado= false;
	boolean cDireita=false;
	boolean cCima=false;
	boolean cBaixo=false;
	boolean cEsquerda=false;
	
       
	public Main() {
	
		mainFrame.setVisible(true);
		mainFrame.setSize(1020,750);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(null);
		menuBar.setBounds(0, 0, mainFrame.getWidth(), 20);
		mainFrame.setJMenuBar(menuBar);
		mainFrame.setResizable(false);
		actions();
		fundo.setBounds(0,0,1020,735);
		
		mainFrame.add(fundo);
        menuBar.add(mainMenu);
        menuBar.add(simMenu);
	simMenu.add(eletrized);
	}
	public void actions() {
		eletrized.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Sim();
				mainFrame.setVisible(false);
			}
		});
	}
	
	public static void main(String[] args) {
			new Main();
	}

}
