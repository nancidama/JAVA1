package LaçosdeRepetição;

import java.util.Scanner;

public class LaçosdeRepFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 1 Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

	
			int numero;
			int restoDiv;
			

		Scanner leia = new Scanner(System.in);
		
		for (numero=0;numero<1999;numero++) {
			
			if (numero>=1000 && numero<=1999) {
				
				if(numero%11==5) {
					
					restoDiv=numero;
			
		System.out.println("\nquando divididos por 11 obtemos o resto de: "+restoDiv);
}


}
		}
	}
}

