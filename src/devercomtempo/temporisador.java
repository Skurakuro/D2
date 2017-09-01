package devercomtempo;

public class temporisador {
	
	public static void main(String[] args){
		//3.	Escreva um programa que dados os litros gastos, os quilômetros percorridos 
		//por um automóvel e o valor do litro de combustível, calcule os gastos de combustível em reais/km.
		
		double litros = 5.;
		double quilometros = 200.;
		double valor = 2.;
		double total;
		
		 
		total = (litros * valor);
		System.out.println("Valor total dos litros R$" + total );
		System.out.println("Total por quilometros R$" + total / quilometros);
		
	
	
}
}
