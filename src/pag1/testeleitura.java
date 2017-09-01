package pag1;
import java.util.Scanner;
public class testeleitura {
	public static void main(String [] args) {

	String nomecompleto;
	Integer idade;
	Double peso;
	String sexo;
	Boolean maiorIdade = false;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("infome o nome :");
	nomecompleto = teclado.nextLine();
	System.out.println(" Informe idade ");
	idade = teclado.nextInt();
	System.out.println(" INforme o peso");
	peso = teclado.nextDouble();
	System.out.println("infrome o sexo ");
	sexo = teclado.next();
	teclado.close();
	
	if (idade >= 18)
		maiorIdade = true;
	System.out.println("O nome imformado foi :" + nomecompleto 
						+"\nA idade imformado foi :" + idade +
						"\nO peso imformado foi :" + peso +
						"\nO sexo imformado foi :" + sexo + 
						"\nCom os dados informados foi definido que a pessoa é " + (maiorIdade ? "maior" : "Menor" ) + "de idade"
						);
	
}	
}
