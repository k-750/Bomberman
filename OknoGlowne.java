import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;


public class OknoGlowne extends JFrame implements ActionListener
{
	static OknoGlowne oknoGlowne;
	JPanel tlo = new JPanel();
	JButton czerwony = new JButton("przetnij");
	final JLabel obrazek = new JLabel(new ImageIcon("bomba.jpeg"));
	JButton niebieski = new JButton("przetnij");
	JLabel labelWyniku = new JLabel();
	JButton sprobuj = new JButton("Spróbuj jeszcze raz");
	
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
		czerwony.addActionListener(this);
		niebieski.addActionListener(this);
		add(tlo);
		setVisible(true);
		labelWyniku.setPreferredSize(new Dimension(200,100));
		add(labelWyniku);
		labelWyniku.setVisible(false);
		sprobuj.setPreferredSize(new Dimension(400,50));
		add(sprobuj);
		sprobuj.addActionListener(this);
		sprobuj.setVisible(false);
	}

	public static void main(String[] args)
	{
		oknoGlowne = new OknoGlowne();

	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		Object source = a.getSource();
		Losuj losuj = new Losuj();
		if (source.equals(czerwony))
			{
			if (losuj.isCzerwony() == true) Wynik.wynik(true, oknoGlowne); else Wynik.wynik(false, oknoGlowne);
			if (losuj.isNiebieski() == true) Wynik.wynik(true, oknoGlowne); else Wynik.wynik(false, oknoGlowne);
			}
		if (source.equals(niebieski))
			{
			if (losuj.isNiebieski() == true) Wynik.wynik(true, oknoGlowne); else Wynik.wynik(false, oknoGlowne);
			if (losuj.isCzerwony() == true) Wynik.wynik(true, oknoGlowne); else Wynik.wynik(false, oknoGlowne);			
			}
		if (source.equals(sprobuj)) Wynik.reset(oknoGlowne);
	}
	
}
