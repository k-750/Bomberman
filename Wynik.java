import java.awt.Color;

public class Wynik
{
	public void wynik(boolean kabel, View view)
	{
		if (kabel == true) 
		{
			view.obrazekSetVisible(false);
			view.czerwonySetVisible(false);
			view.niebieskiSetVisible(false);
			view.tloSetVisible(false);
			view.labelWynikuSetText("TYM RAZEM CI SIE UDAŁO!!");
			view.labelWynikuSetVisible(true);
			view.sprobujSetVisible(true);
			view.sprobujSetBackground(Color.GREEN);
		}
		else
		{
			view.obrazekSetVisible(false);
			view.czerwonySetVisible(false);
			view.niebieskiSetVisible(false);
			view.tloSetVisible(false);
			view.labelWynikuSetText("NIE ŻYJESZ!!");
			view.labelWynikuSetVisible(true);
			view.sprobujSetVisible(true);
			view.sprobujSetBackground(Color.RED);
		}
	}
	public void reset(View view)
	{
		view.obrazekSetVisible(true);
		view.czerwonySetVisible(true);
		view.niebieskiSetVisible(true);
		view.tloSetVisible(true);
		view.labelWynikuSetVisible(false);
		view.sprobujSetVisible(false);
	}
}
