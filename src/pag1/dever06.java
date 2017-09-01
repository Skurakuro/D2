package pag1;
import java.util.Scanner;
public class dever06 {
public static void main(String []args) {
	
	double A;
	double B;
	double sub;
	double soma;
	double div;
	double mult;
	 
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Digite o valor A");
	A = teclado.nextDouble();
	
	System.out.print("Digite o valor B");
	B = teclado.nextDouble();
	
	sub = A - B;
	soma = A + B;
	div = A/B;
	mult = A * B;
	teclado.close();
	System.out.println("O valor da subtração : "+sub);
	System.out.println("O valor da soma : "+soma);
	System.out.println("O valor da divisão : "+div);
	System.out.println("O valor da multiplicação : "+mult);
}
}
