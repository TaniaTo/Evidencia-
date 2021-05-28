package Evidencia1;



public class Pacientes1 {

	
		
	

	
	// Atributos 
	private String nombre ;
	private int ID;
	
	public Pacientes1() {
		nombre ="";
		ID =0;
	}
	public Pacientes1(String n , int m) {
		nombre =n;
		ID=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
