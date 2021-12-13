package Arrays2vetor;

	import java.util.Scanner;

	public class Exer1Arrays {
	//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[][] numeros = new int[3][3];
			int coluna,linha,maior10;
			
			Scanner leia = new Scanner(System.in);
			
			for(linha=0;linha<3;linha++)
			{
				for(coluna=0;coluna<3;coluna++)
				{
					System.out.println("\nEntre com um número: ");
					numeros[linha][coluna] = leia.nextInt();
					
					if(numeros[linha][coluna] >10)
					{
						maior10++;
					
					}
					
			System.out.println("\nOs numero maiores que 10 são: ",maior10);
		}
			
			}
		}
	}



