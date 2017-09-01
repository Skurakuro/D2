package devercomtempo;
import java.util.Scanner;
public class dever4 {

	public static void main(String [] args) {
		
		//4.	Uma revendedora de carros paga aos seus vendedores um salário mensal fixo de R$ 800,00 
		//mais uma comissão de R$ 300,00 por carro vendido. Faça um programa que dada a quantidade de carros vendidos pelofuncionário, calcule
		//e mostre o seu salário total
		
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
