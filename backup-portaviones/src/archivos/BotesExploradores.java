package archivos;

public class BotesExploradores extends Botes {
	
	private boolean combate;
	
	public BotesExploradores(double capacidadlitros, int tripulantes, boolean combate)
	{
		super(capacidadlitros, tripulantes);
		this.combate=combate;
	}
	
////////////////////////////////////////////////
	public boolean getCombate()
	{
		return combate;
	}
	
	public void setCombate(boolean combate)
	{
		this.combate=combate;
	}

/////////////////////////////////////////////////
	@Override
	public String toString()
	{
		return getCapacidadlitros() + " de combustible, y puede llevar hasta " + getTripulacion() + " personas a la vez, puede entrar o no en  " + combate;
	}
	
}

