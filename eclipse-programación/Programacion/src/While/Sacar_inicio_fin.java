package While;

public class Sacar_inicio_fin {
	public static void main(String[]args) {
		int[]numero=new int[10];
		numero[0]=1;
		numero[1]=2;
		numero[2]=3;
		numero[3]=4;
		numero[4]=5;
		numero[5]=6;
		numero[6]=7;
		numero[7]=8;
		numero[8]=9;
		numero[9]=10;
		int inicio=0;
		int fin=9;
		int i=0;
		while(inicio<fin) {
			System.out.println(numero[i]);
			i=i+1;
		}//while
		
	}//main
}
