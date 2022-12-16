package Final_t2;
public class SinEspacios {
/*Codifica una función sinEspacios que reciba un String y devuelva otro idéntico al recibido 
 *pero habiéndole quitado todos los espacios que tuviera al principio y/o al final.
 *Puedes hacerlo recorriendo el String o usando las funciones trim() y strip() de String (fácil, 1 punto)
 *o manualmente recorriendo el String con charAt (2 puntos). Su signatura será:
 *public static String sinEspacios(String str)*/
	public static void main(String[]args){
		String frase="Cualquier cosa que digas puede ser utilizada en tu contra";
		int n=frase.length();
		sinEspacios(frase,n);
		System.out.println(sinEspacios(frase,n));
	}//main
	public static String sinEspacios(String frase, int n){
		String resultado;
		frase=frase.replace(",", "");
		frase=frase.replace(".", "");
		frase=frase.replace(" ","");
		resultado=frase;
		return resultado;
	}//sinEspacios
}//class
