package Piedra_papel_tijeras;

import java.util.Scanner;
public class Piedra_papel_tijeras {
	   public static void main(String[]args) {
		  
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Introduce un número ");
	        System.out.println("1=piedra.2=papel.3=tijeras.4=Salir del juego");
	        int jugador=sc.nextInt();
	      if(jugador!=4) {
	        int ordenador = (int)(Math.random() *3)+1; 
	 
	        System.out.println(ordenador);
	        while(jugador!=4){
	            while (jugador==1) {
	                if (ordenador==1){
	                    System.out.println("Empate");
	                    
	                }//if
	                if (ordenador==2){
	                    System.out.println("Perdiste");
	                }//if
	                if(ordenador==3){
	                    System.out.println("Ganaste");
	                }//if
	                break;
	            }//while
	            while (jugador==2) {
	                if (ordenador==1){
	                    System.out.println("Ganaste");
	                    
	                }//if
	                if (ordenador==2){
	                    System.out.println("Empate");
	                }//if
	                if(ordenador==3){
	                    System.out.println("Perdiste");
	                }//if
	                break;
	            }//while
	            while (jugador==3) {
	                if (ordenador==1){
	                    System.out.println("Perdiste");
	                    
	                }//if
	                if (ordenador==2){
	                    System.out.println("Ganaste");
	                }//if
	                if (ordenador==3){
	                    System.out.println("Empate");
	                }//if
	                break;
	            }//while
	            }//while
	      }//if
	      else {
	    	  System.out.println("Vale, si no quieres jugar no juegues");
	      }
	    }//main
	 
	 	 }//class
