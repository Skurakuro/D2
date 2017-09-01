package pag1;
import java.util.Scanner;
public class dever09 {
public static void main(String []args) {
	
	Scanner teclado = new Scanner(System.in);
	
	int var1;
	int var2;
	int quadrado;
	int cubo;
	
	System.out.println("Digite o primerio valor :");
	var1 = teclado.nextInt();
	
	System.out.println("Digite o segundo valor : ");
	var2 = teclado.nextInt();
	
	quadrado = var1 * var1;
	cubo = var2 * (var2 * var2) ;
	
	teclado.close();
	
	System.out.println("O valor do quadrado do primeiro numero : " + quadrado);
	System.out.println("O valor do segundo numero : " + cubo);
}
}
