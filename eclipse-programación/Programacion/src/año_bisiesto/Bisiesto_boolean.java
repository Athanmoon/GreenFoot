package año_bisiesto;
import java.util.Scanner;
public class Bisiesto_boolean {
	    public static void main(String[]args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int numero=sc.nextInt();
	        boolean condicion1= numero/4 %10==0;
	        boolean condicion2= numero/100 %10==0;
	        boolean condicion3= numero/400 %10==0;
	        if(condicion1) {
	            System.out.println("Es bisiesto");
	        }//if
	            else {
	                if(condicion2){
	                    if(condicion3) {
	                        System.out.println("Es bisiesto");    
	                    }//if
	                        else {
	                            System.out.println("No es bisiesto");    
	                        }//else
	                }//if
	            }//else
	    }//main
	}//class
