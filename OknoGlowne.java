import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OknoGlowne extends JFrame
{
	JPanel tlo = new JPanel();
	JButton czerwony = new JButton("przetnij");
	final JLabel obrazek = new JLabel(new ImageIcon("bomba.jpeg"));
	JButton niebieski = new JButton("przetnij");
	
	public OknoGlowne()
	{
		super("Bomberman");
		setSize(500,280);
		setLocation(200,50);
		tlo.setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		tlo.add(czerwony);
		tlo.add(obrazek);
		tlo.add(niebieski);
		add(tlo);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		OknoGlowne oknoGlowne = new OknoGlowne();

	}
	
}
