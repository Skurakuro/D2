package pag1;
import java.util.Scanner;
public class testesenha {
	public static void main(String []args) {
		
		int senha = 123;
		int senhadigitada;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a sua senha : ");
		senhadigitada = teclado.nextInt();
		
		teclado.close();
		
		while(senha == senhadigitada) {
			System.out.println("Está logado !");
		}
		
}
}
