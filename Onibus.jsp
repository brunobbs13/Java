Crie uma classe para um �nibus tur�stico para levar pessoas de S�o Paulo at� uma cidade tur�stica.
A classe deve armazenar o local atual, quantidade de paradas, capacidade do �nibus e quantas pessoas est�o
presentes nele. A classe deve tamb�m disponibilizar os seguintes m�todos: Inicializa (m�todo construtor), Entra (quando entra algu�m), Sai (quando algu�m desce do �nibus), Parar (o �nibus para de andar) 
e andar.Crie um prgrama que instacie essa classe tr�s vezes, listando suas paradas, quantas pessoas sobem e quantas pessoas descem.
Dentro do programa, deve ser poss�vel modificar cada um dos atributos do �nibus.

class onibus{
	bollean acelerar
	bollean freiar
	String local; 
	int quantParadas; 
	int capacidade; 
	int passageiros;
	int entraPass;
	int sairPass; 
}

 public onibus(String local, int quantParadas, int capacidade, int passageiros) {
        this.local = local;
        this.quantasParadas = quantasParadas;
        this.capacidade = capacidade;
        this.passageiros = passageiros;   
    }


public void iniciar() {
	System.out.println("O onibus foi ligado");
}

public bollean acelerar(){
	return acelerar; 
}

public bollean freiar(){
	return freiar;	
}


public int entrar(int pessoas){
	this passageiros = passageiros + pessoas
}

public int sair(){
	this passageiros = passageiros - pessoas
}

 public String returnLocal() {
        return this.local;
}    
   
public String returnParadas() {
        return this.paradas;
}    
    
public String returnCapacidade() {
        return this.Capacidade;
}    
    
public String returnPassageiros() {
        return this.Passageiros;
}    