package Final_t2;
import java.util.Scanner; 
public class Notas_programación {
/* Codifica un programa que mantenga en un array
 * nombres de alumnos y en otro array la nota de
 * programación de cada alumno 
 * (índice correlativo al primer array) 
 * El programa pedirá un nombre de alumno,
 * lo buscará en el primer array y si lo encuentra,
 * mostrará en pantalla su nota
 * (índice correlativo en el segundo array)*/
	public static void main(String[]args) {
		char[] numeros=new char[10];
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		char[] alumnos=new char[10];
		alumnos[0]=Eliane;
		alumnos[1]=Nahili;
		alumnos[2]=Eva;
		alumnos[3]=Christofer;
		alumnos[4]=David;
		alumnos[5]=Sabin;
		alumnos[6]=Luis;
		alumnos[7]=Markus;
		alumnos[8]=Miguel;
		alumnos[9]=Sara;
		enum alumnos{Eliane, Nahili, Eva, Christofer, David, Sabin, Luis, Markus, Miguel, Sara};
		System.out.println("Dime el alumno y te diré la nota");
		Scanner sc=new Scanner(System.in);
		char nombre=sc.next();
		notas(alumnos, numeros, nombre);
	}//main
	public static int notas(char alumnos[],int numeros[], String nombre){
		int x=0;
		x++;
		int i;
		i=(int) (Math.random()*10);
		while(nombre.equals(nombre[x])) {
			if(alumnos[x].equals(nombre) {
				
				System.out.println(numeros[i]);
			}//if
			else
				x++;
		}//while
		return i;
		
	}//notas
}//class
