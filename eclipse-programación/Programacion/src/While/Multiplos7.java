package While;

public class Multiplos7 {
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
		numeros[30]=31;
		numeros[31]=32;
		numeros[32]=33;
		numeros[33]=34;
		numeros[34]=35;
		numeros[35]=36;
		numeros[36]=37;
		numeros[37]=38;
		numeros[38]=39;
		numeros[39]=40;
		numeros[40]=41;
		numeros[41]=42;
		numeros[42]=43;
		numeros[43]=44;
		numeros[44]=45;
		numeros[45]=46;
		numeros[46]=47;
		numeros[47]=48;
		numeros[48]=49;
		numeros[49]=50;
		int condicion; 
		int i;
		i=0;
		
		while(i<50){
			condicion=numeros[i]%7;
			if(condicion==0){
			System.out.println(numeros[i]);
			}//if
			i++;
		}//if
		
	}//main
}//class
