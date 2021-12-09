package Laços;

import java.util.Scanner;

public class exercicio2Laços {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tENTRE COM TRÊS VALORES...");		
		System.out.println("\nEntre com o primeiro valor: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		n3=leia.nextInt();

		if(n1>n2)
		{
			numero=n1;
			n1=n2;
			n2=numero;
		}
		if(n2>n3)
		{
			numero=n2;
			n2=n3;
			n3=numero;	
		}
		if(n1>n2)
		{
			numero=n1;
			n1=n2;
			n2=numero;
		}
		
		System.out.println("A ordem crescente dos números é: "+n1+","+n2+","+n3+".");
	}



	

}
