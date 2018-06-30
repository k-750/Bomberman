import java.awt.EventQueue;

public class Bomberman
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Wynik wynik = new Wynik();
				Model model = new Model();
				View view = new View();
				Controller controller = new Controller(model,view,wynik);
				
				view.addObserver(controller);
			}
		});
	}
}
