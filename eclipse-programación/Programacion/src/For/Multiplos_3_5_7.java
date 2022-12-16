package For;

public class Multiplos_3_5_7 {
	public static void main(String[]args){
		int[] numeros=new int[50];
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
		numeros[20]=21;
		numeros[21]=22;
		numeros[22]=23;
		numeros[23]=24;
		numeros[24]=25;
		numeros[25]=26;
		numeros[26]=27;
		numeros[27]=28;
		numeros[28]=29;
		numeros[29]=30;
		int condicion1;
		int condicion2;
		int condicion3;
		for(int i=0;i>30;++i){
			condicion1=numeros[i]%3;
			condicion2=numeros[i]%5;
			condicion3=numeros[i]%7;
			if(condicion1==0||condicion2==0||condicion3==0){
			System.out.println(numeros[i]);
			}//if
			i++;
		}//for
	}//main
}//class
