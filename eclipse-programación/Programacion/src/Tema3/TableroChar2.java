package Tema3;

public class TableroChar2 {
	
	public static void main(String[]args) {
		int filas=5;
		int columnas=5;
		int i=0;
		int j=0;
		char[][] tablero=new char[filas][columnas];
		rellenaTablero(tablero);
		System.out.println(tableroATexto);
		
	}//main
	public static void rellenaTablero(char[][]tablero){
		int i=0;
		int j=0;
		int filas=5;
		int columnas=5;
		for (i=0;i<filas;++i) {
			for(j=0;j<columnas;j++) {
				if ((i+j)%2==0) {
					tablero[i][j]='	';
				}//if
				else {
				tablero[i][j]='*';
				}//else
			}//for
		}//for
	}//rellena tablero
	public static String tableroATexto(char[][]tablero) {
		String res="";
		int filas=5;
		int columnas=5;
		for (int i=0;i<tablero.length;++i) {
			for(int j=0;j<tablero.length;j++) {
				res+="";
			}//for
			res+="";
		}//for
	}//tableroATexto
}//class
