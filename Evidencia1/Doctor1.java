package Evidencia1;


public class Doctor1

{
	
	
	
	private String nombreDoctor ;
	private int ide ;
	private String Especialidad;


	
  public Doctor1() 
  {
	  nombreDoctor="";
	  ide =0;
	  Especialidad="";
	  
	}
  public Doctor1(String n, int m , String l) {
	  nombreDoctor =n;
	  ide=0;
	  Especialidad =l;
	  
  }


public String getNombreDoctor() {
	return nombreDoctor;
}


public void setNombreDoctor(String nombreDoctor) {
	this.nombreDoctor = nombreDoctor;
}


public int getIde() {
	return ide;
}


public void setIde(int ide) {
	this.ide = ide;
}


public String getEspecialidad() {
	return Especialidad;
}


public void setEspecialidad(String especialidad) {
	Especialidad = especialidad;
}

	
}

  

