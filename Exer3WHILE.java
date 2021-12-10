package LaçosdeRepetição;

import java.util.Scanner;

public class Exer3WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
		//O programa termina quando idade for =-99. (WHILE)
	
	int idade,TotalP21=0,TotalP50=0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com uma idade: ");
	idade=leia.nextInt();
	
	
	{
		if(idade<=21 && idade>=50);
		TotalP21++;
		TotalP50++;
		
		System.out.println("\ninforme sua idade: ");

	
	while(idade<=-99)
		
		System.out.println("\ninforme sua idade: ");
		idade=leia.nextInt();
	{

		
		if(idade<=21 && idade>=50);
		TotalP21++;
		TotalP50++;
	}
	
	
		System.out.println("\ntivemos "+TotalP21+ " pessoas com a idade menor que 21");
		System.out.println("\ntivemos "+TotalP50+ " pessoas com a idade maiorr que 50");
		}
	
	}
}

	
	
	

