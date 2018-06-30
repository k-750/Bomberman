import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame implements ActionListener
{
	private JPanel tlo = new JPanel();
	private JButton czerwony = new JButton("przetnij");
	private final JLabel obrazek = new JLabel(new ImageIcon("bomba.jpeg"));
	private JButton niebieski = new JButton("przetnij");
	private JLabel labelWyniku = new JLabel();
	private JButton sprobuj = new JButton("Spróbuj jeszcze raz");
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	private Object source;
	
	public View()
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
	
	public void addObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void notifyObservers()
	{
		for (Observer o : observers)
		{
			o.update(source,czerwony,niebieski,sprobuj);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		source = event.getSource();		
		notifyObservers();
	}

}
