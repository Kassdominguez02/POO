/* Notas
 * 
 * Establecemos los pasos para con nuestras  clases, definiendo el sig. orden
 * 
 * -1.- Definir propiedades o atributos usando variables JAVA
 * -2.-Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor por defecto que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 * 
 * - Por ultimo definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones que retornar un tipo de valor).
 * 
 * 
 * Notas adicionales:
 * 
 * -Sobrecarga de metodos: la finanlidad es  utilizar el mismo nombre del metodo (persona) e ir variando sus parametrso con esto evitamos usar "Persona1, "Perosna2", etc. para utilizar el mismo metodo en diferentes situaciones. No permite re-utilizar codigo.
 * 
 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */







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
		
		// si no respetamos el orden de los parametros (el orden en el tipo de dato), tendremos problemas para instanciar a nuestro objeto)
		

	}// cierre del main
	
	

}// ciere de la clase persona
