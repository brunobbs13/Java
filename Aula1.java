import java.util.Scanner;//Importa uma biblioteca 

public class Aula1 {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); //Adiciona um Scaneer para ler os dados armazenados pela variável. 
		
		Byte time; //Tipo de variável - Nome da Variável 
		String nome;
		Byte escolha; 
		
		System.out.println("Olá, Digite o seu nome:");
		nome = texto.nextLine();
		
		System.out.printf("Você gosta de futebol: \n");
		System.out.printf("1) Sim \n");
		System.out.printf("0) Não \n");
		escolha = texto.nextByte();
		
		
		if (escolha == 0 ) {
			System.out.println("Então finalizamos o programa");
		}if (escolha == 1 ) {
		System.out.println("Parabéns, você pode contiuar");
	
				
		}
		
		System.out.println("Escolha o time que você torce:"); //Para mostrar coisas na tela 
		System.out.print("1) Corinthans \n");
		System.out.print("2) Palmeiras \n");
		System.out.print("3) Gremio \n");
		System.out.print("4) Ítuano \n");
		time= texto.nextByte(); //Para armazenar um dado 
		
		System.out.printf("Você gosta de futebol:");
		
		switch(time) {
			
		case 1:{
				System.out.printf("Olá %s, fico feliz em sber que você é Corinthiano",nome);
			}
		break;
		case 2:{
				System.out.printf("Olá %s, fico feliz em sber que você é Palmeirense ",nome);
			}
		break;
		case 3:{
				System.out.printf("Olá %s, fico feliz em sber que você é Gremista",nome);
			}
		break;
		case 4:{
				System.out.printf("Olá %s, fico feliz em sber que você é Íuanoensse",nome);
			}
		break;
		default: 
			System.out.printf("O número digitado não foi compreendido");
		}
		
	
	}

}
