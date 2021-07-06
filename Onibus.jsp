Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos: Inicializa (método construtor), Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) 
e andar.Crie um prgrama que instacie essa classe três vezes, listando suas paradas, quantas pessoas sobem e quantas pessoas descem.
Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.

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