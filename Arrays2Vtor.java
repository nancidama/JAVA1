package Arrays2vetor;

import java.util.Scanner;

public class Arrays2Vtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int x,Par=0, impar=0, quantidadeIP=0;
			int[] numero = new int[6];
			
			Scanner leia = new Scanner(System.in);
			
			for(x=0;x<6;x++)
			{
				System.out.println("\nDigite o valor vetor: ");
				numero[x] = leia.nextInt();
				
				if(numero[x]%2==0)
				{
					Par+=numero[x];
			
				}
				else
				{
					impar += numero[x];
					quantidadeIP++;
				}
			}
			
			for (x=0;x<6;x++) {
				if (numero[x] %2==0) {
				System.out.println("Os numeros pares s�o " +numero[x]);
			}
				else
				{
					System.out.println("Os numero impares s�o "+numero[x]);
				}
			}
			
			
			System.out.println("\nA soma deu: "+Par); //soma (s� pra eu n�o esquecer)
			System.out.println("\n A soma dos impares: "+impar);
			System.out.println("\nA quantidade de impares ser� de: "+quantidadeIP);
			
	}

}
