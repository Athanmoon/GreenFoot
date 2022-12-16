package DNI_NIF;

import java.util.Scanner;

public class Dni_nif {
	public static void main(String[]args) {
		char secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		 System.out.println("Escribe tu DNI");
	     Scanner sc= new Scanner(System.in);
	     String dni=sc.nextLine();
	     int resto=dni%23;
	     char letraNif=secuenciaLetrasNIF[resto];
	     System.out.println(dni+letraNif);
	}//main
	 
}//class
