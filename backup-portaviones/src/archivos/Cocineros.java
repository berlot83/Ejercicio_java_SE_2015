package archivos;

public class Cocineros extends Personal{
	
	private boolean combate;
	
	public Cocineros(String genero, int edad, double peso, double altura, String nombre, String apellido, String familia, boolean combate)
	{
		super(genero, edad, peso, altura, nombre, apellido, familia);
		this.combate=combate;
	}
	
//////////////////////////////////////////////////
	public boolean getCombate()
	{
		return combate;
	}
	
	public void setCombate(boolean combate)
	{
		this.combate=combate;
	}
	
////////////////////////////////////////////////////	
	@Override
	public String toString()
	{
	return getNombre() + getApellido() + " es un " + getGenero() + " su edad es de " + getEdad() + " su altura es de " + getAltura() + "," + getFamilia() + " tiene familia, y " + combate + "combate";
	}

}
