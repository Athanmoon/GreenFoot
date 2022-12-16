package Random;

import java.util.Scanner;

public class Random {
	public static void main(String[]args) {
		int num=(int)(Math.random()*40)+1;
		System.out.println("Adivina el número en el que está pensando el ordenador :)");
	    Scanner sc= new Scanner(System.in);
	    int s=sc.nextInt();
	    int contador=0;
	    contador++;
	    
	    while (s!=num) {
	    	System.out.println("Intentalo de nuevo");
	    	 Scanner numx= new Scanner(System.in);
	    	   int x=numx.nextInt();
	    	   contador++;
	    	   if(x==num) {
	   	    	System.out.println("¡Correcto! Lo has intentado "+contador+" veces");
	    		}//else
	    	 
	    	}//while
	    if(s==num) {
	    	System.out.println("¡Correcto!Lo has intentado "+contador+" veces");
	    }//if
	}//main
}//class