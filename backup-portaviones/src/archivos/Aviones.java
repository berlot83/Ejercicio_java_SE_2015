package archivos;

public class Aviones {
	
	private String modelo;
	private double capacidadarmas;
	private double capacidadlitros;
	private int potencia;
	private int tripulantes;
	private double autonomia;
	
	
/////////////////////////////////////////////////
	public Aviones(String modelo, double capacidadarmas, double capacidadlitros, int potencia, int tripulantes, double autonomia )
	{
		this.modelo = modelo;
		this.capacidadarmas= capacidadarmas;
		this.capacidadlitros= capacidadlitros;
		this.potencia= potencia;
		this.tripulantes= tripulantes;
		this.autonomia= autonomia;	
	}
	
	
//////////////////////////////////////////////////
	public String getModelo()
	{
		return modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo= modelo;
	}
	
	
//////////////////////////////////////////////////
	public double getCapacidadarmas()
	{
		return capacidadarmas;
	}
	
	public void setCapacidadarmas(double capacidadarmas)
	{
		this.capacidadarmas= capacidadarmas;
	}
	
//////////////////////////////////////////////////
	public double getCapacidadlitros()
	{
		return capacidadlitros;
	}

	public void setCapacidadlitros(double capacidadlitros)
	{
		this.capacidadlitros= capacidadlitros;
	}
	
//////////////////////////////////////////////////
	public int getPotencia()
	{
		return potencia;
	}
	
	public void setPotencia(int potencia)
	{
		this.potencia=potencia;
	}
	
//////////////////////////////////////////////////
	public int getTripulantes()
	{
		return tripulantes;
	}
	
	public void setTripulantes(int tripulantes)
	{
		this.tripulantes= tripulantes;
	}

//////////////////////////////////////////////////
	public double getAutonomia()
	{
		return autonomia;
	}
	
	public void setAutonomia(double autonomia)
	{
		this.autonomia= autonomia;
	}
	
	
	
	@Override
	public String toString()
	{
		return getModelo() + " tiene una capacidad de " + capacidadarmas + "kg de carga de armas, como también una capacidad de carga de combustible de " + capacidadlitros + " L, su potencia es de " + potencia + " Kg fuerza, puede llevar hasta " + tripulantes + " y su autonomía ronda en los " + autonomia + " km de alcance sin re-abastecimiento.";
	}
	
	
	
}
