//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Ex2_Usando_If_Complexo {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); 

		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número");
		num1 = texto.nextInt();
		System.out.println("Digite o segundo  número");
		num2 = texto.nextInt();
		System.out.println("Digite o terceiro número");
		num3 = texto.nextInt();
		 
	
		if (num1 < num2 && num2 > num3) {
			System.out.printf("O maior número é o: %d",num2);
		}if (num2 < num1 && num1 > num3) {
			System.out.printf("O maior número é o: %d",num1);
		}if (num2 < num3 && num3 > num1) {
			System.out.printf("O maior número é o: %d",num3);
		}
	}

}
