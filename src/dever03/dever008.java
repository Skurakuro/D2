package dever03;
import java.util.Scanner;
public class dever008 {
 public static void main(String [] args) {
	 Scanner tela = new Scanner(System.in);
	 int ano;
	 
	 System.out.print("Digite o ano :");
	 ano = tela.nextInt();
	 tela.close();
	 
	 if ( ano % 4 == 0) {
		 System.out.print("O ano é bissexto");
	 }else {
		 System.out.print("O ano não é bissexto");
	 }
 }
}
