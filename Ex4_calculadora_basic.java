import java.util.Scanner;

public class Ex4_calculadora_basic {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); 
		
		int num1, num2, soma, sub, div, mult, decisao; 
		
		System.out.println("Digite o primeiro número");
		num1 = texto.nextInt();
		
		System.out.println("Digite a operação desejada");
		System.out.println("1) ADIÇÃO");
		System.out.println("2) SUBTRAÇÃO");
		System.out.println("3) MULTIPLICAÇÃO");
		System.out.println("4) DIVISÃO");
		decisao = texto.nextInt();
		
		System.out.println("Digite o segundo  número");
		num2 = texto.nextInt();
		
		if (decisao == 1) {
			soma = num1 + num2;
			System.out.printf("O resultado é %d:" ,soma);
		}if (decisao == 2) {
			sub = num1 - num2;
			System.out.printf("O resultado é %d:" ,sub);
		}if (decisao == 3) {
			mult = num1 * num2;
			System.out.printf("O resultado é %d:" ,mult);
		}if (decisao == 4) {
			div = num1 / num2;
			System.out.printf("O resultado é %d:", div);
		}
	}

}
