package DNI_NIF;

import java.util.Scanner;

public class DNI_NIF{
	public static void main(String[]args) {
		System.out.println("Escribe tu DNI");
        Scanner sc= new Scanner(System.in);
        String dni=sc.nextLine();
        boolean condicion;
        condicion= dni.length()==9;
		if(condicion()) {
			 String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		     String numeroNIF = dni.substring(0, dni.length()-1);
		     numeroNIF = numeroNIF.replace("X", "0").replace("Y", "1").replace("Z", "2");
		     char letraNIF = dni.charAt(8);
		     int i =Integer.parseUnsignedInt(numeroNIF) % 23;
          }//if
          else {
        	  System.out.println("El DNI no es válido");
          }//else
          
      }//main
}//class
