//6. Fa�a um programa em Java que leia 10 n�meros informados pelo usu�rio e ao final da leitura escrever a soma total dos 10 n�meros lidos.





import java.util.Scanner; 

public class Ex6_Soma_de_valores_com_For {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, soma;
		
	
	
			System.out.printf("Informe o primeiro n�mero:");
			num1 = texto.nextInt();
			System.out.printf("Informe o segundo n�mero:");
			num2 = texto.nextInt();
			System.out.printf("Informe o teceiro n�mero:");
			num3 = texto.nextInt();
			System.out.printf("Informe o quarto n�mero:");
			num4 = texto.nextInt();
			System.out.printf("Informe o quinto n�mero:");
			num5 = texto.nextInt();
			System.out.printf("Informe o sexto n�mero:");
			num6 = texto.nextInt();
			System.out.printf("Informe o set�mo n�mero:");
			num7 = texto.nextInt();
			System.out.printf("Informe o oitavo n�mero:");
			num8 = texto.nextInt();
			System.out.printf("Informe o n�no n�mero:");
			num9 = texto.nextInt();
			System.out.printf("Informe o dec�mo n�mero:");
			num10 = texto.nextInt();
			
			soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
			
			System.out.printf("A soma dos seguintes n�meros: %d + %d + %d + %d + %d + %d + %d + %d + %d + %d, tem como resultado: %d: ",num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, soma);
		}

	}


