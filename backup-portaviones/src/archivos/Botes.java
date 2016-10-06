package archivos;

public abstract class Botes {
	

	private double capacidadlitros;
	private int tripulacion;
	
	public Botes(double capacidadlitros, int tripulacion)
	{
		this.capacidadlitros= capacidadlitros;
		this.tripulacion= tripulacion;
	}
	
//////////////////////////////////////////////
	public double getCapacidadlitros()
	{
		return capacidadlitros;
	}
	
	public void setCapacidadlitros(int capacidadlitros)
	{
		this.capacidadlitros=capacidadlitros;
	}
	
//////////////////////////////////////////////
	public int getTripulacion()
	{
		return tripulacion;
	}
	
	public void setTripulacion(int tripulacion)
	{
		this.tripulacion= tripulacion;
	}
}
