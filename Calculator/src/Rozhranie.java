import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rozhranie {
	public void rozhranie () {
        Okno mojeOkno = new Okno();
        mojeOkno.setSize(300,200); 
	mojeOkno.setTitle("Calculator");
   	mojeOkno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon ikona=new ImageIcon("C:/Users/juraj/desktop/ikona.png");
	mojeOkno.setIconImage(ikona.getImage());
	JPanel p1=new JPanel(new GridLayout(3,3));
	for (int i=0;i<10;i++){
		JButton tlacitko=new JButton(new Integer(i).toString());
		p1.add(tlacitko);}
	JButton tlacitko_1=new JButton("+");
	p1.add(tlacitko_1);
	JButton tlacitko_2=new JButton("-");
	p1.add(tlacitko_2);
	mojeOkno.setLayout(new GridLayout(3,4));
	mojeOkno.getContentPane().add(p1,BorderLayout.CENTER);
	JButton tlacitko_3=new JButton("=");
	mojeOkno.add(tlacitko_3,BorderLayout.SOUTH);
	JLabel Info_bar=new JLabel();
	mojeOkno.add(Info_bar,BorderLayout.NORTH);
	mojeOkno.setVisible(true);
	}
}
