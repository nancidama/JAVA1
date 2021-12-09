package choroduraumanoite;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float notas,mediaFinal,mediaPonderada,res1,res2,res3;
		res1=2;
		res2=3;
		res3=5;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nQual é a média final do aluno res1: ");
		res1=leia.nextFloat();
		
		System.out.println("\nmedia final do aluno res2: ");
		res2=leia.nextFloat();
		
		System.out.println("\nmedia final do aluno res3: ");
		res3=leia.nextFloat();
		
		mediaPonderada=(res1*res1+res2*res2+res3*res3) /10;
		
		System.out.println("\nSua nota média foi de: "+mediaPonderada );
	}

}
