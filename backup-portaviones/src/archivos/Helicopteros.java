package archivos;

public class Helicopteros extends Aviones {
	
	private int peso;
	
	
	public Helicopteros(String modelo, double capacidadarmas, double capacidadlitros, int potencia, int tripulantes, double autonomia, int peso)
	{
		super(modelo, capacidadarmas, capacidadlitros, potencia, tripulantes, autonomia);
		this.peso=peso;
	}
	
	public double getPeso()
	{
		return peso;
	}
	
///////////////////////////////////////////////	
	@Override
	public String toString()
	{
		return getModelo() + " tiene una capacidad de " + getCapacidadarmas() + "kg de carga de armas, como también una capacidad de carga de combustible de " + getCapacidadlitros() + " L, su potencia es de " + getPotencia() + " Kg fuerza, puede llevar hasta " + getTripulantes() + ", su autonomía ronda en los " + getAutonomia() + " km de alcance y su peso es de " + peso;
	}
}
