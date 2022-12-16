package año_bisiesto;
import java.util.Scanner;
public class Bisiesto {
	    public static void main(String[]args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int numero=sc.nextInt();
	        int condicion1= numero/4 %10;
	        int condicion2= numero/100 %10;
	        int condicion3= numero/400 %10;
	        if(condicion1==0) {
	            System.out.println("Es bisiesto");
	        }//if
	            else {
	                if(condicion2==0){
	                    if(condicion3==0) {
	                        System.out.println("Es bisiesto");    
	                    }//if
	                        else {
	                            System.out.println("No es bisiesto");    
	                        }//else
	                }//if
	            }//else
	    }//main
	}//class
