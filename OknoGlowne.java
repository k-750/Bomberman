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


public class OknoGlowne extends JFrame implements ActionListener
{
	private static OknoGlowne oknoGlowne;
	private JPanel tlo = new JPanel();
	private JButton czerwony = new JButton("przetnij");
	private final JLabel obrazek = new JLabel(new ImageIcon("bomba.jpeg"));
	private JButton niebieski = new JButton("przetnij");
	private JLabel labelWyniku = new JLabel();
	private JButton sprobuj = new JButton("Spróbuj jeszcze raz");
	private Losuj losuj = new Losuj();
	
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
	
	public void tloSetVisible(boolean v)
	{
		tlo.setVisible(v);
	}
	
	public void czerwonySetVisible(boolean v)
	{
		czerwony.setVisible(v);
	}
	
	public void obrazekSetVisible(boolean v)
	{
		obrazek.setVisible(v);
	}
	
	public void niebieskiSetVisible(boolean v)
	{
		niebieski.setVisible(v);
	}
	
	public void labelWynikuSetVisible(boolean v)
	{
		labelWyniku.setVisible(v);
	}
	
	public void labelWynikuSetText(String t)
	{
		labelWyniku.setText(t);
	}
	
	public void sprobujSetVisible(boolean v)
	{
		sprobuj.setVisible(v);
	}
	
	public void sprobujSetBackground(Color c)
	{
		sprobuj.setBackground(c);
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		Object source = a.getSource();
		losuj.losuj();
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
