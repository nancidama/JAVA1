package La�os;

import java.util.Scanner;

public class exercicio1La�os {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,numeroMaior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n escreva um n�mero...");		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("O maior n�mero �: "+n1);
		}
		if(n2>n1 && n2>n3)
		{
			System.out.println("O maior n�mero �: "+n2);
		}
		if(n3>n1 && n3>n2)
		{
			System.out.println("O maior n�mero �: "+n3);
		}
	}	
		

	}


