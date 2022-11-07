package aplicacion;
import dominio.*;
import interfaz.*;


public class Principal{
	public static void main(String args[]){
		System.out.println("Hola Mundo");
		Libreta libreta = new Libreta();

		libreta.setId(9);
		System.out.println(libreta);

		
	}

}
