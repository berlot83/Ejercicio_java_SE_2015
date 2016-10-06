package archivos;

public class Pilotos extends Personal{
	
	private boolean vuela;
	private int horasvuelo;
	private  int derrivos;

		public Pilotos(String genero, int edad, double peso, double altura, String nombre, String apellido, String familia, boolean vuela, int horasvuelo, int derrivos)
		{
		super(genero, edad, peso, altura, nombre, apellido, familia);
		this.vuela= vuela;
		this.horasvuelo= horasvuelo;
		this.derrivos= derrivos;
		}
		
//////////////////////////////////////////////////
		public boolean getVuela()
		{
			return vuela;
		}
		
		public void setVuela(boolean vuela)
		{
			this.vuela=vuela;
		}
		
//////////////////////////////////////////////////
		public int getHorasvuelo()
		{
			return horasvuelo;
		}
		
		public void setHorasvuelo(int horasvuelo)
		{
			this.horasvuelo=horasvuelo;
		}
		
//////////////////////////////////////////////////
		public int getDerrivos()
		{
			return derrivos;
		}
		
		public void setDerrivos(int derrivos)
		{
			this.derrivos=derrivos;
		}
		
//////////////////////////////////////////////////
		@Override
		public String toString()
		{
		return getNombre() +" "+ getApellido() + " es un " + getGenero() + " su edad es de " + getEdad() + " su altura es de " + getAltura() + "," + getFamilia() + " tiene familia, " + vuela + " vuela y juntó unas " + horasvuelo + "horas de vuelo acumuladas al momento, así como también " + derrivos + " aviones derrivados.";
		}
}
