import java.util.Random;

public class Model
{
	private boolean czerwony;
	private boolean niebieski;
	
	public void losuj()
	{
		Random losuj = new Random();
		if (losuj.nextInt(2) == 1)
		{
			czerwony = true;
			niebieski = false;
		}
		else {
			czerwony = false;
			niebieski = true;
		}
	}
	
	public boolean isCzerwony()
	{
		return czerwony;
	}

	public boolean isNiebieski()
	{
		return niebieski;
	}
}
