package devercomtempo;
import java.util.Scanner;
public class dever4 {

	public static void main(String [] args) {
		
		//4.	Uma revendedora de carros paga aos seus vendedores um sal�rio mensal fixo de R$ 800,00 
		//mais uma comiss�o de R$ 300,00 por carro vendido. Fa�a um programa que dada a quantidade de carros vendidos pelofuncion�rio, calcule
		//e mostre o seu sal�rio total
		
		double salariom = 800.;
		double comicao ; 
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite quantidades de carros vendidos :");
		numero = teclado.nextInt();
		teclado.close();
		comicao = ( 300. * numero);
	
		System.out.print("Salario total R$:" + ( comicao + salariom));
		
	}
}
