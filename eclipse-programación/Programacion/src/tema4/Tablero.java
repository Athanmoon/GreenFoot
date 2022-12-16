package tema4;

import java.util.Arrays;

public class Tablero {
	private char[][] tablero;//atributos always private
	
	public String toString() {
		String res="";
		for(int i=0;i<=tablero.length;i++) {
			for(int j=0;j<=tablero[0].length;j++) {
				res+=tablero[i][j]+"";
			}
		}
		return res+"\n";
	}
	public Tablero(int tamagno) {//constructor. Nombre=Nombre clase
		this.tablero=new char [tamagno][tamagno];
	}
	public void char rellena(char caracter) {
		for(int i=0;i<=tablero.length;i++) {
			for(int j=0;j<=tablero[0].length;j++) {
				tablero[i][j]=caracter;
			}
		}
	}
	public char getCasilla(int ancho, int alto) {
		return tablero[ancho][alto];
	}
	public void setCasilla(int ancho, int alto, char cambio) {
		tablero[ancho][alto]=cambio;
	}
	
}
