//7. Faça um programa que leia 10 números que o usuário vai informar. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.


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
		System.out.printf("o valor dos números somados é: %d", x);
				
	}
}
