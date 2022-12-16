package For;

public class Multiplos3 {
	public static void main(String[]args){
		int[] numeros=new int[20];
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
		numeros[10]=11;
		numeros[11]=12;
		numeros[12]=13;
		numeros[13]=14;
		numeros[14]=15;
		numeros[15]=16;
		numeros[16]=17;
		numeros[17]=18;
		numeros[18]=19;
		numeros[19]=20;
		int condicion; 
		for(int i=0;i<20;++i){
			condicion=numeros[i]%2;
			if(condicion!=0){
			System.out.println(numeros[i]);
			}//if
			i++;
		}//if
		
	}//main
}
