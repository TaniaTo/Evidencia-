package Evidencia1;

import java.util.Scanner;

public class cita {
	
	
		
	cita la =new cita();
	
	
	String nombre ="";
	int ID =0;
	String nombreDoctor="";
	int ide=0;
	String Especialidad =" ";
	int dia;
	int mes;
	int ao ;
	String motivo ;
	
	//LLAMAR A CLASES 
	

	Pacientes1 a[] = new Pacientes1[10];
	Doctor1  b[] = new Doctor1[10]; 
	
	Scanner leer = new Scanner(System.in);

	
	
	
	public void DatosPaciente() {
		for (int i=0;i<a.length;i++) {
			System.out.println("Digita el nombre del paciente completo");
			nombre=leer.nextLine();
			
			
			System.out.println("Digita el ID del pasiente");
			ID=leer.nextInt();
			
			a[i]= new Pacientes1(nombre,ID);
		}
	}

		
		public void DatosDoctor() {
			
			 b[0].setNombreDoctor("Ariana Anelis Torres Avila");
			  b[0].setIde(555);
			  b[0].setEspecialidad("General");
			  
			  b[1].setNombreDoctor("Gabriel Alexander Torre");
			  b[1].setIde(333);
			  b[1].setEspecialidad("General");
			  
			  b[2].setNombreDoctor("Karen Maria Luisa Mendoza Lozano");
			  b[2].setIde(122);
			  b[2].setEspecialidad("General");
			  
			  b[3].setNombreDoctor("Angel Axel Guzman Guerrero");
			  b[3].setIde(455);
			  b[3].setEspecialidad("General");
			
			
			
			for (int i=0;i<b.length;i++) {
				
				System.out.println("Digita el nombre del Doctor completo");
				nombreDoctor=leer.nextLine();
				
				System.out.println("Digita el ID del doctor ");
				ide=leer.nextInt();
				
				
				System.out.println("Digita la especialidad ");
				Especialidad=leer.nextLine();
				
				b[i]= new Doctor1(nombreDoctor,ide,Especialidad);
			}
			}
			public void PedirDatosCita() {
				
				System.out.println("Dia de la cita ");
				dia=leer.nextInt();
				
				System.out.println("mes de la cita con numero");
				mes=leer.nextInt();
				System.out.println("año de la cita");
				ao=leer.nextInt();
				
			}
			
			public void JuntarDatos() {
				
				
				System.out.println("TU CITA ES");
				System.out.println(" DIA :" + dia);
				System.out.println("MES: " + mes);
				System.out.println(" AÑO : " + ao);
				
				
			}
			public void menu () {
			
				String  nombres;
				 int codigo;
				int IDe;
				Scanner uno = new Scanner(System.in);
				
				System.out.println("SISTEMA DE ADMINISTRACION DE CITAS ");
				
				System.out.println("Por favor digite su nombre ");
				nombres=uno.nextLine();
				
				System.out.println("Bienvenido ->"  + nombres);
				
				
				System.out.println("Ingrese su ID");
				IDe=uno.nextInt();
				System.out.println("Ingrese su contraseña");
				codigo=uno.nextInt();
			
				if(codigo == 123 && IDe == 456789) {
					int dos;
					do {
						
					System.out.println("Bienvenido");
					
					System.out.println("****MENU*****");
					System.out.println("2-Dar de alta Doctores");
					System.out.println("3-Dar de alta Pacientes");
					System.out.println("4-Crear Cita ");
					System.out.println("5-Salir");
					System.out.println("Elije una opcion");
					dos=uno.nextInt();
					
					switch(dos) {
					
					case 2:
						// DAR DE ALTA DOCTORES
						System.out.println("****DAR DE ALTA DOCTORES****");
						System.out.println("Bienvenido" + nombres);
						
				          la.DatosDoctor();
						
						
						break;
						
					case 3:
						//DAR DE ALTA PACIENTES 
						System.out.println("*****DAR DE ALTA PACIENTES*****");
						System.out.println("Bienvenido" + nombres);
						
						la.DatosPaciente();
						break;
						
					case 4:
						la.PedirDatosCita();
						
						
						
						break;
						
					case 5: 
						
						System.out.println("Adios");
						break;
						
						
					default:
							break;
					}
					}while(dos!=5);
				}
			}
				
				
					
				}
			
			
			
		
		
	

