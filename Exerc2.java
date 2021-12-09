package choroduraumanoite;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int anos,meses,dias,res1;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com a sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("\nEntre com em meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nEntre com em dias: ");
		dias = leia.nextInt();
		
		res1 = meses*dias;
		
		System.out.println("\nQual a sua idade em dias:"+ res1+ " apenas dias ");
				
	}
	

}
