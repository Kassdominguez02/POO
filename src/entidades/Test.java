package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado EvilFelipe = new Empleado ("Evil Felipe", 31,"Evil@gmail.com","999999","abc123", "99999999","bell boy");

		EvilFelipe.mostrarInformacion();
		
		
		// Instancia de una persona
		Persona Naruto =new Persona ("Naruto", 30, "naruto@gmail.com", "8888888");
		
		Naruto.mostrarInformacion();
		
		
		System.out.println("impresion de objetos");
		System.out.println(EvilFelipe); //  nos dice el paquete, la clase y la maemoria que ocupa el objeto. pero si declaramos el toString para representar el objeto en si, mostrara el objeto en cadena de texto
		
		
		// Instancia de un cliente
		
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus=new Cliente("Jesus","ABCD1234",157666.00f,"1234" );
		Jesus.mostrarInfoCliente();
		
		//Modificacion de un atributo
		System.out.println();
		Jesus.nombre="Evil Jesus";
		Jesus.setSaldo(0.00f);
		
		Jesus.mostrarInfoCliente();
		
		// acceder a info privada
		//System.out.println(Jesus.cuentaBancaria); error porque esta info es privada
		
		// info con  getter y setetr
		
		System.out.println(Jesus.getSaldo());
		
		
		
	}//cierre de main

}//cierre de la clase
