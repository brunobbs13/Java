//7. Fa�a um programa que leia 10 n�meros que o usu�rio vai informar. Todos os n�meros lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.


import java.util.Scanner;

public class Ex7_soma_com_If {

	public static void main(String[] args) {
			Scanner texto = new Scanner (System.in);
			
			int n = 0, x = 0, r;		
		
		
			while (n < 10){
				System.out.println("Digite o valor desejado: \n");
				r = texto.nextInt();
			if (r < 40){
				x = x + r;	
			}
			n++;		
		}
		System.out.printf("o valor dos n�meros somados �: %d", x);
				
	}
}
