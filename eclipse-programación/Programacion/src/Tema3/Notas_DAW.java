package Tema3;
import java.util.Scanner;
public class Notas_DAW {
	public static void main(String[]args){
		int[][] notas1= new int[30][6];
		char i=0;
		char j=0;
		for (i=0;i<29;++i) {
			for(j=0;j<5;j++) {
					notas1[i][j]=(int)(Math.random() *10+1); 
			}//for
		}//for
		for (i=0;i<29;++i) {
			for(j=0;j<5;j++) {
					System.out.print(notas1[i][j]+"\t");
			}//for
			System.out.println();
		}//for
		
	}//main
}
