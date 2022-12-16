package Tema3;

public class TableroChar {
	public static void main(String[]args){
		char filas=5;
		char columnas=5;
		char[][] tablero= new char[filas][columnas];
		char i=0;
		char j=0;
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
		for (i=0;i<filas;++i) {
			for(j=0;j<columnas;j++) {
				System.out.print(tablero[i][j]);
			}//for
			System.out.println();
		}//for
		
	}//main

}
