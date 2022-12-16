package EjemplosIniciales;

public class Ejemplosiniciales1 {
	public static void main(String[]args) {
		System.out.println(nVeces("",40));
		System.out.println("*");
	}//main
	public static String nVeces(String orig,int veces) {
		String resultado="";
		while(veces>0) {
			resultado=resultado+orig;
			veces--;
		}//while
		return resultado;
	}//nVeces
	public static void saludar() {
		System.out.println("Hola, hola, caracola");
	}//saludar
}//class
