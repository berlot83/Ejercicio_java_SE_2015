package archivos;

public abstract class Personal {

	private String genero;
	private int edad;
	private double peso;
	private double altura;
	private String nombre;
	private String apellido;
	private String familia;
	
	
	public Personal(String genero, int edad, double peso, double altura, String nombre, String apellido, String familia)
	{
		this.genero= genero;
		this.edad= edad;
		this.peso= peso;
		this.altura= altura;
		this.nombre= nombre;
		this.apellido= apellido;
		this.familia= familia;
	}
	
//////////////////////////////////////////////////	
	public String getGenero()
	{
		return genero;
	}
	
	public void setGenero(String genero)
	{
		this.genero=genero;
	}
	
//////////////////////////////////////////////////
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
//////////////////////////////////////////////////
	public double getPeso()
	{
		return peso;
	}
	
	public void setPeso(double peso)
	{
		this.peso=peso;
	}
	
//////////////////////////////////////////////////
	public double getAltura()
	{
		return altura;
	}
	
	public void setAltura(double altura)
	{
		this.altura=altura;
	}
	
//////////////////////////////////////////////////
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre= nombre;
	}
	
//////////////////////////////////////////////////
	public String getApellido()
	{
		return apellido;
	}
	
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	
//////////////////////////////////////////////////
	public String getFamilia()
	{
		return familia;
	}
	public void setFamilia(String familia)
	{
		this.familia=familia;
	}
}
