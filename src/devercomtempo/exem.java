package devercomtempo;
import java.util.Scanner;
public class exem {
public static void main(String []args) {
	
	double nota;
	double freq;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite a nota :");
	nota = teclado.nextDouble();
	
	System.out.println("Digite a frequ�ncia :");
	freq = teclado.nextDouble();
	teclado.close();
	
	if ( nota >= 6.0 && freq >= 75 ) { 
		System.out.println("Voc� Passou !!");
	}else { 
		System.out.println("Sinto muito mais n�o !!!");}
}
}
