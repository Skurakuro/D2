package pag1;

public class dever03 {
public static void main(String []args) {
	
	double ass = 32.;
	double pim = 0.09;
	double imp = 254.;
	double tim = 90.;
	double pch = 0.35;
	double chama = 23.;
	double total ;
	
	total = ass + ( pim *( imp - tim )) +( pch * chama);
	
	System.out.print("valor total de :" + total);
}
}
