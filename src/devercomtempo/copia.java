package devercomtempo;

public class copia {
public static void main(String [] args) {
	
 String opcao;

 opcao = "Java";

 switch (opcao) {
 	case "Web2":
 	case "web2":
 	case "Web02":
 	case "web02":
 	System.out.println("Desenvolvimneto de sites resposivos, templates e jQuery, ajax");
 	break;
 	case "PHP":
 	case "Php":
 	case "php":
 	System.out.println("Criação de sites informativos, sistemas integrados a um SGBD");
 	break;
 	case "JAVA":
 	case "Java":
 	case "java":
 		System.out.println("Criação de sistemas robustos, muito utilizado por bancos");
 	break;
 	default:
 	System.out.println("Nenhum das opções acima...");
 }
	
	
}
}
