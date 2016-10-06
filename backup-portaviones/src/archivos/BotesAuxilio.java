package archivos;

public class BotesAuxilio extends Botes {

	private int capacidadremedios;
	
			public BotesAuxilio(double capacidadlitros, int tripulacion, int capacidadremedios)
			{
				super(capacidadlitros, tripulacion);
				this.capacidadremedios=capacidadremedios;
			}
			
//////////////////////////////////////////////
			public int getCapacidadremedios()
			{
				return capacidadremedios;
			}
			
			public void setCapacidadremedios(int capacidadremedios)
			{
				this.capacidadremedios=capacidadremedios;
			}
			
	@Override
	public String toString()
	{
	return getCapacidadlitros() + " de combustible, y puede llevar hasta " + getTripulacion() + " personas a la vez, su carga de remedios es de " + capacidadremedios;
	}
}
