//Fa�a um programa que leia um valor informado pelo usu�rio e diga se o valor informado � positivo, negativo ou zero.

import java.util.Scanner;

public class Ex1_Usando_o_If {

	public static void main(String[] args) {
	Scanner texto = new Scanner (System.in); 

		int num;
		
		System.out.println("Digite um n�mero");
		num = texto.nextInt();
		 
		
		
		if (num < 0) {
			System.out.println("O n�mero � negativo");
		}else if (num > 0) {
			System.out.println("O n�mero digitado � positivo");
		}else if (num == 0) {
			System.out.println("O n�mero digitado � zero");
		}
	}

}
