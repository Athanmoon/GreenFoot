package Palindromo_y_capicua;
import java.util.Scanner;
public class Capicua {
	        public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int s=sc.nextInt();
	        int fin = s.length()-1;
	        int ini=0;
	        boolean espalin=true;
	    
	        while(ini < fin){
	            if(s.charAt(ini)!=s.charAt(fin)){
	                espalin=false;
	            }
	        ini++;
	        fin--;
	        }
	        if(espalin)
	            System.out.print("\nEs palindromo.");
	        else
	            System.out.print("\nNo es palindromo.");
	        
	    }//main
	}//class
