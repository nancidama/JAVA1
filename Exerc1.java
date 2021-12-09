package choroduraumanoite;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos,meses,dias,idade,expressaDias1,expressaDias2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva sua idade em anos,meses e dias: ");
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nEntre com em meses: ");
		meses = leia.nextInt();
		
		System.out.println("\nEntre com em dias: ");
		dias = leia.nextInt();
		
		expressaDias1 = (idade*dias);
		expressaDias2 = (idade*meses);
		
		System.out.println("\nSeu tempo em dias na terra é igual: "+expressaDias1+expressaDias2);
				
	}

	
}
