package archivos;


public class Oficiales extends Personal {

	private String rango;
	
	public Oficiales(String genero, int edad, double peso, double altura, String nombre, String apellido, String familia, String rango)
	{
		super(genero, edad, peso, altura, nombre, apellido, familia);
		this.rango= rango;
	}
	
//////////////////////////////////////////////////
	public String getRango()
	{
		return rango;
	}
	
	public void setRango(String rango)
	{
		this.rango=rango;
	}

//////////////////////////////////////////////////
	@Override
	public String toString()
	{
	return getNombre() +" "+ getApellido() + " es un " + getGenero() + ", su edad es de " + getEdad() + " años, su altura es de " + getAltura() + "m," + getFamilia() + " tiene familia, y su rango es " + rango;
	}
}
