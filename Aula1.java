import java.util.Scanner;//Importa uma biblioteca 

public class Aula1 {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in); //Adiciona um Scaneer para ler os dados armazenados pela vari�vel. 
		
		Byte time; //Tipo de vari�vel - Nome da Vari�vel 
		String nome;
		Byte escolha; 
		
		System.out.println("Ol�, Digite o seu nome:");
		nome = texto.nextLine();
		
		System.out.printf("Voc� gosta de futebol: \n");
		System.out.printf("1) Sim \n");
		System.out.printf("0) N�o \n");
		escolha = texto.nextByte();
		
		
		if (escolha == 0 ) {
			System.out.println("Ent�o finalizamos o programa");
		}if (escolha == 1 ) {
		System.out.println("Parab�ns, voc� pode contiuar");
	
				
		}
		
		System.out.println("Escolha o time que voc� torce:"); //Para mostrar coisas na tela 
		System.out.print("1) Corinthans \n");
		System.out.print("2) Palmeiras \n");
		System.out.print("3) Gremio \n");
		System.out.print("4) �tuano \n");
		time= texto.nextByte(); //Para armazenar um dado 
		
		System.out.printf("Voc� gosta de futebol:");
		
		switch(time) {
			
		case 1:{
				System.out.printf("Ol� %s, fico feliz em sber que voc� � Corinthiano",nome);
			}
		break;
		case 2:{
				System.out.printf("Ol� %s, fico feliz em sber que voc� � Palmeirense ",nome);
			}
		break;
		case 3:{
				System.out.printf("Ol� %s, fico feliz em sber que voc� � Gremista",nome);
			}
		break;
		case 4:{
				System.out.printf("Ol� %s, fico feliz em sber que voc� � �uanoensse",nome);
			}
		break;
		default: 
			System.out.printf("O n�mero digitado n�o foi compreendido");
		}
		
	
	}

}
