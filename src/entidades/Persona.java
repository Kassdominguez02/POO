package entidades;

public class Persona {

	// 1.- Propiedaddes o atributos

	public String nombre; //null
	public int edad; //null
	public String correo; //null
	public String telefono;// null

	// 2.-Constructor (4 parametros)

	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;

	}// cierre constructor
	

	
	//Sobrecarga de metodo (overloading) constructor con 3
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    

    //Sobrecarga de metodo (overloading) constructor con 2 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;            
        this.edad = edad;
    }
	

	// 3.-Metodos
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Correo: "+ correo);
		System.out.println("Telefono: "+ telefono);
	
	}//cierre de mostrarInformacion

	
	//Metodo main es una funcion  "ejecutora"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Instancia de un objeto persona
		
		Persona Felipe=new Persona("Felipe",31,"felipe.maqueda@idr.edu.mx","66665555");
		
		Felipe.mostrarInformacion();
		
		Persona Kass=new Persona ("Kassandra",29,"kassdomlara@gmail.com","9999999");
		
		Kass.mostrarInformacion();
		
		Persona Alex=new Persona("Alex",31,"alex@gmail.com","66665557");
		
		Alex.mostrarInformacion();
		
		Persona Faby=new Persona("Faby",38,"faby@gmail.com","8886557");
		
		Faby.mostrarInformacion();
		
		// No se puede instanciar porque no hay constructor con un solo parametro
		
		// Persona Naruto = new Persona ("Naruto");
		
		// Uso del metodo mostrarInformacion que queremos mostrar
		

	}// cierre del main
	
	

}// ciere de la clase persona
