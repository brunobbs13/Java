//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

import java.util.Scanner;

public class Ex1_Usando_o_If {

	public static void main(String[] args) {
	Scanner texto = new Scanner (System.in); 

		int num;
		
		System.out.println("Digite um número");
		num = texto.nextInt();
		 
		
		
		if (num < 0) {
			System.out.println("O número é negativo");
		}else if (num > 0) {
			System.out.println("O número digitado é positivo");
		}else if (num == 0) {
			System.out.println("O número digitado é zero");
		}
	}

}
