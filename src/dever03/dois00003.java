package dever03;
import java.util.Scanner;
public class dois00003 {
public static void main(String [] args) {

	Scanner teclado = new Scanner(System.in);
	String a,B,aub;
	
	System.out.print("Digite o valor de A");
	aub = teclado.nextLine();
	System.out.print("Digite o valor de B");
	B = teclado.nextLine();
	teclado.close();
	
	a = aub;
	a = B;
	B = aub;
	
	System.out.println("O valor de B agora é :" + B);
	System.out.print("O valor de A agora é :" + a);
	
}
}
