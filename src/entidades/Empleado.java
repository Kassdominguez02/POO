/*Herencia POO
 * 
 * Nos permite heredar atributos y metodos con la finalidad de reutilizar codigo y generar un relacion entre clases superiores (padres) y las subclases (hijos).
 * 
 * Super clase (clase superior) es la clase de quien vamos a heredar (persona)
 * subclase(clase hijo)es donde vamos a poner lo que heredamos.
 * 
 *  Para heredar, usamos una palabra reservada llamada extends. Esta palabra se coloca al alado del nombre de mi clase (Empleado), y despues definimos el lugar de donde nos vamos a traer las cosas que queremos heredar (Persona).
 * 
 * 
 * 
 * Para heredar constructores de una forma muy rapida, daremos click derecho sobre nuestro editor de codigo, despues buscaremos la opcion source y despues en la opcion de Generate Constructor using fields. En la segunda ventana, veremos la cantidad de constructores disponibles para heredar.
 * 
 * 
 * 
 * 
 * 
 * 
 * */





package entidades;

// Primeri dar la instruccion que quiero heredar

public class Empleado extends Persona {

	//1.- Atributos o propiedades

	public String numEmpleado;
	public String nss;
	public String puesto;

	// 2.- Constructor con parametros (heredamos "la mitad" del constructor de Persona)

	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);// nos indica que heredamos (esto es de la clase SUPERIOR), evitamos repetir los this
		this.numEmpleado = numEmpleado; // solo defino los this que hacen falta.
		this.nss = nss;
		this.puesto = puesto;

	}
	
	// Heredar constructores sobrecargados
	
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	
	// 3.- Metodo para imprimir la info del empleado
	
	public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformacion

	
	
	
	//4.- toString 
	
	// toString es un metodo que proveiede de la clase objeto (el antecesor o precursor de todos los objetos que existen en JAVA). Este metodo ya se escribio, ya esta definido y nos permite mostrar la info del objeto en cadena de texto.
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre
				+ ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
	}// cierre toString
	

	

	// TODO Auto-generated constructor stub

}// cierre de la clase
