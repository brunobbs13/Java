import java.util.Scanner;

public class Ex4_calculadora_basic {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); 
		
		int num1, num2, soma, sub, div, mult, decisao; 
		
		System.out.println("Digite o primeiro n�mero");
		num1 = texto.nextInt();
		
		System.out.println("Digite a opera��o desejada");
		System.out.println("1) ADI��O");
		System.out.println("2) SUBTRA��O");
		System.out.println("3) MULTIPLICA��O");
		System.out.println("4) DIVIS�O");
		decisao = texto.nextInt();
		
		System.out.println("Digite o segundo  n�mero");
		num2 = texto.nextInt();
		
		if (decisao == 1) {
			soma = num1 + num2;
			System.out.printf("O resultado � %d:" ,soma);
		}if (decisao == 2) {
			sub = num1 - num2;
			System.out.printf("O resultado � %d:" ,sub);
		}if (decisao == 3) {
			mult = num1 * num2;
			System.out.printf("O resultado � %d:" ,mult);
		}if (decisao == 4) {
			div = num1 / num2;
			System.out.printf("O resultado � %d:", div);
		}
	}

}
