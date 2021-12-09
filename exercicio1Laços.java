package Laços;

import java.util.Scanner;

public class exercicio1Laços {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,numeroMaior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n escreva um número...");		
		System.out.println("\nEntre com o primeiro número: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro número");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("O maior número é: "+n1);
		}
		if(n2>n1 && n2>n3)
		{
			System.out.println("O maior número é: "+n2);
		}
		if(n3>n1 && n3>n2)
		{
			System.out.println("O maior número é: "+n3);
		}
	}	
		

	}


