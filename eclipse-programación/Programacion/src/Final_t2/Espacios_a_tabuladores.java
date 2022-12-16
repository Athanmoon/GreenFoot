package Final_t2;

public class Espacios_a_tabuladores {
/* Haz un programa que a partir de un texto genere otro String distinto igual
 *  al primero pero habiendo sustituido todos los espacios o tabuladores por 
 *  saltos de línea sin usar funciones específicas de la clase String más 
 *  allá de length() y charAt() (o como mucho exportarlo a array de char)*/
	public static void main(String[]args){
		String frase="Cualquier cosa que digas puede ser utilizada en tu contra";
		int n=frase.length();
		sinEspacios(frase,n);
		System.out.println(sinEspacios(frase,n));
	}//main
	public static String sinEspacios(String frase, int n){
		String resultado;
		frase=frase.replace(",", "	");
		frase=frase.replace(".", "	");
		frase=frase.replace(" ","	");
		resultado=frase;
		return resultado;
	}//sinEspacios
}
