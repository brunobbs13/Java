//3- Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escreva a soma dos 2 maiores.
import java.util.Scanner;

public class Ex3_Somando_os_dois_maiores_numeros {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); 

		int num1, num2, num3, soma1, soma2, soma3;
		
		
		System.out.println("Digite o primeiro número");
		num1 = texto.nextInt();
		System.out.println("Digite o segundo  número");
		num2 = texto.nextInt();
		System.out.println("Digite o terceiro número");
		num3 = texto.nextInt();
		 
	
		if (num1 < num2 && num1 < num3) {
			soma1 = num2 + num3;
			System.out.printf("A soma dos dois maiores números é: %d",soma1);
		}
		if (num2 < num1 && num2 < num3) {
			soma2 = num1 + num3;
			System.out.printf("A soma dos dois maiores números é: %d",soma2);
		}if (num3 < num2 && num3 < num1) {
			soma3 = num1 + num2;
			System.out.printf("A soma dos dois maiores números é: %d",soma3);
		}
	}

}
