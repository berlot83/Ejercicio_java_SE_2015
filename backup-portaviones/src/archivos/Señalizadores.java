package archivos;

public class Señalizadores extends Personal {
	
	public Señalizadores(String genero, int edad, double peso, double altura, String nombre, String apellido, String familia)
	{
		super(genero, edad, peso, altura, nombre, apellido, familia);
	}

///////////////////////////////////////////////
	@Override
	public String toString()
	{
	return getNombre() +" "+ getApellido() + " es un " + getGenero() + " su edad es de " + getEdad() + " su altura es de " + getAltura() + "," + getFamilia() + " tiene familia.";
	}

}
