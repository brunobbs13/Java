//6. Faça um programa em Java que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.





import java.util.Scanner; 

public class Ex6_Soma_de_valores_com_For {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, soma;
		
	
	
			System.out.printf("Informe o primeiro número:");
			num1 = texto.nextInt();
			System.out.printf("Informe o segundo número:");
			num2 = texto.nextInt();
			System.out.printf("Informe o teceiro número:");
			num3 = texto.nextInt();
			System.out.printf("Informe o quarto número:");
			num4 = texto.nextInt();
			System.out.printf("Informe o quinto número:");
			num5 = texto.nextInt();
			System.out.printf("Informe o sexto número:");
			num6 = texto.nextInt();
			System.out.printf("Informe o setímo número:");
			num7 = texto.nextInt();
			System.out.printf("Informe o oitavo número:");
			num8 = texto.nextInt();
			System.out.printf("Informe o nóno número:");
			num9 = texto.nextInt();
			System.out.printf("Informe o decímo número:");
			num10 = texto.nextInt();
			
			soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
			
			System.out.printf("A soma dos seguintes números: %d + %d + %d + %d + %d + %d + %d + %d + %d + %d, tem como resultado: %d: ",num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, soma);
		}

	}


