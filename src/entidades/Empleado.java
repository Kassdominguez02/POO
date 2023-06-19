package entidades;

// Primeri dar la isntrucction que quiero heredar

public class Empleado extends Persona {

	//1.- Atributos o propiedades

	public String numEmpleado;
	public String nss;
	public String puesto;

	// 2.- Constructor con parametros (heredamos "la mitad" del constructor de Persona)

	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);// nos indica que heredamos (esto es de la clase SUPERIOR)
		this.numEmpleado = numEmpleado;
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

	

	// TODO Auto-generated constructor stub

}// cierre de la clase
