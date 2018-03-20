import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class OknoGlowne extends JFrame
{
	
	private int iloscPunktow;
	
	private JLabel labelPunkty;
	
	/**
	 * panel z punktami i opisami
	 */
	JPanel panelGorny;
	
	/**
	 * panel z poligonem
	 */
	JPanel panelDolny;
	
	/**
	 * tabela min
	 */
	private JButton[] pola = new JButton[100];
	
	public OknoGlowne()
	{
		super("Bomberman");
		setSize(650,500);
		setLocation(200,50);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelGorny = new JPanel();				// panel z punktami
		panelGorny.setBounds(10,10,630,30);
		panelGorny.setBackground(Color.WHITE);
			labelPunkty = new JLabel("Punkty: "+iloscPunktow);
			panelGorny.add(labelPunkty);
		this.add(panelGorny);
			
		panelDolny = new JPanel();			// panel z minami
		panelDolny.setBounds(10,60,630,430);
		panelDolny.setBackground(new Color(200,230,240));
		panelDolny.setLayout(new GridLayout(10,10,1,1));
			
			for (int i = 0; i<100; i++)
			{
				pola[i] = new JButton(" ");
				panelDolny.add(pola[i]);
			}

		this.add(panelDolny);	
	}

	public static void main(String[] args)
	{
		OknoGlowne oknoGlowne = new OknoGlowne();

	}
	
}
