package tema4;

public class JuegoHLF {
	public static void main(String[]args) {
		Tablero t1=new Tablero(8);
		t1.rellena('*');
		t1.setCasilla(8, 5, '+');
		System.out.println(t1);
	}
}
