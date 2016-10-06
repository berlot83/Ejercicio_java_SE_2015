package archivos;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class Principal {
	
	public static void main(String[] args)
	{
		
		
	System.out.println("\nModelos disponibles de aviones:");
		List<Aviones> listaviones= crearAviones();
		for (Aviones Detalle : listaviones) {
            System.out.println(Detalle.toString());}
		
		
		System.out.println("\nModelos disponibles de helicopteros:");
			List<Helicopteros> listhelicopteros= crearHelicopteros();
			   for(Helicopteros Detalle : listhelicopteros) {
				   System.out.println(Detalle.toString());}
		   
		   
		   System.out.println("\nEstos son los oficiales arriba del barco:");
		   		List<Oficiales> listoficiales= crearOficiales();
		   		for(Oficiales Detalle : listoficiales) {
		   			System.out.println(Detalle.toString());}   
		   		
		   		
		   	
	}
	
    private static List<Aviones> crearAviones() {
        List<Aviones> listaviones = new ArrayList<>();
        listaviones.add(new Aviones("F-16", 3000, 2000, 5000, 1, 800));
        listaviones.add(new Aviones("F-18", 3800, 2500, 6000, 2, 1100));
        listaviones.add(new Aviones("F-15", 4200, 3500, 6900, 2, 2800));
        listaviones.add(new Aviones("F-22", 1800, 2000, 4200, 1, 2000));
    return listaviones;
	}
    
    
    private static List<Helicopteros> crearHelicopteros(){
    	List<Helicopteros> listhelicopteros= new ArrayList<>();
    	listhelicopteros.add(new Helicopteros("MD-5", 500, 600, 700, 2, 300, 1200));
    	listhelicopteros.add(new Helicopteros("AH-64", 1500, 1000, 1100, 2, 400, 2500));
    	listhelicopteros.add(new Helicopteros("AH-1", 150, 1000, 1100, 10, 200, 1000));
    return listhelicopteros;
    }
    
    private static List<Oficiales> crearOficiales(){
    	List<Oficiales> listoficiales= new ArrayList<>();
    	listoficiales.add(new Oficiales("Hombre" ,33, 50.45, 1.20, "José", "Lopez", " no", "alto" ));
    return listoficiales;
    }
    

}
