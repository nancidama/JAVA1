package La�osdeRepeti��o;

import java.util.Scanner;

public class Exer2La�osRepe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	
		int numero = 0,x;
				int par=0,impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=10;x++)
		
		System.out.print("\nDigite o n�mero "+x+" numero");
		numero=leia.nextInt();
		
			{
			
		if (numero %2==0)
		{
			par++;
		}
		else
		{
			impar++;
		}

		System.out.println("possui inclusos "+par+" numeros pares e "+impar+" impar...");
		
		
	}
}
	}


            	
               
