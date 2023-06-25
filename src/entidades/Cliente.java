package entidades;

public class Cliente {
	
	//1.- Atributos
	
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	
	
	//2.- Constructor
	
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		super();
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.setSaldo(saldo);
		this.nip = nip;
		
	}// cierre constructor
	
	//3-Metodos
	
	public void mostrarInfoCliente() {
		System.out.println("el nombre es:"+nombre);
		System.out.println("la cuenta bancaria  es:"+cuentaBancaria);
		System.out.println("el saldo es:"+getSaldo());
		System.out.println("el nip es:"+nip);
		
	}// cierre mostarInfo

	
	// Getter y Setter
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}// cierre clase

/*
 * Encapsulamiento (1 de los pilares de POO)
 * 
 * Tiene que ver con la forma en como oculatamos algunos detalles de nuestra clase (atributos y metodos). La ventaja de hacer esto podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos.
 * 
 * Modificadores de acceso
 * 
 * -public
 * -private
 * -protected
 * -default (sin modificador de acceso)
 * 
 * con esto buscamos evitar:
 * 	-Reasignacion de valores
 * 
 * 	float cuenta=157478.7f
 * cuenta=0.00f;
 * 
 * 
 * control de acceso: Podemos usar validaciones o valores booleanos para tener acceso o no la info ( que un admin puede usar un getter o setter para modificar el acceso, etc.), sin modificar el codigo externo que la utiliza (herencia, etc.)
 * 
 * -Abstraccion
 * 
 * 
 * 
 * */
 