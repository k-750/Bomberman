import javax.swing.JButton;

public class Controller implements Observer
{
	private Model model;
	private View view;
	private Wynik wynik;
	
	public Controller(Model m, View v, Wynik w)
	{
		model = m;
		view = v;
		wynik = w;
	}

	@Override
	public void update(Object source, JButton czerwony, JButton niebieski,JButton sprobuj)
	{
		model.losuj();
		if (source.equals(czerwony))
		{
		if (model.isCzerwony() == true) wynik.wynik(true, view); else wynik.wynik(false, view);
		if (model.isNiebieski() == true) wynik.wynik(true, view); else wynik.wynik(false, view);
		}
	if (source.equals(niebieski))
		{
		if (model.isNiebieski() == true) wynik.wynik(true, view); else wynik.wynik(false, view);
		if (model.isCzerwony() == true) wynik.wynik(true, view); else wynik.wynik(false, view);			
		}
	if (source.equals(sprobuj)) wynik.reset(view);
		
	}
}
