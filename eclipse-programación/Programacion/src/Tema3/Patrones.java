package Tema3;

public class Patrones {
	public static void main(String[]args){
		char filas=5;
		char columnas=5;
		char[][] matriz= new char[filas][columnas];
		char i=0;
		char j=0;
		for (i=0;i<filas;++i) {
			for(j=0;j<columnas;j++) {
				matriz[i][j]='*';
			}//for
			
		}//for
		for (i=0;i<filas;++i) {
			for(j=0;j<columnas;j++) {
				System.out.print(matriz[i][j]);
			}//for
			System.out.println();
		}//for
		
	}//main
}
