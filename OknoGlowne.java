import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OknoGlowne extends JFrame
{
	
	private int iloscPunktow;
	
	/**
	 * wyświetla ilość punktów 	
	 */
	private JLabel labelPunkty;
	
	/**
	 * panel z punktami i opisami
	 */
	JPanel panelGorny;
	
	/**
	 * panel z poligonem
	 */
	JPanel panelDolny;
	

	public OknoGlowne()
	{
		super("Bomberman");
		setSize(800,700);
		setLocation(200,50);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelGorny = new JPanel();
		panelGorny.setBounds(10,10,780,30);
		panelGorny.setBackground(Color.WHITE);
			labelPunkty = new JLabel("Punkty: "+iloscPunktow);
			panelGorny.add(labelPunkty);
		add(panelGorny);
		
		panelDolny = new JPanel();
		panelDolny.setBounds(10,80,780,600);
		panelDolny.setBackground(new Color(200,230,240));
		add(panelDolny);
		
		
	}

	
	public static void main(String[] args)
	{
		OknoGlowne oknoGlowne = new OknoGlowne();

	}
	
	
	public int getIloscPunktow()
	{
		return iloscPunktow;
	}

	public void setIloscPunktow(int iloscPunktow)
	{
		this.iloscPunktow = iloscPunktow;
	}
	
	

}
