
    import java.sql.Date;
    import java.util.Scanner;
    import javax.xml.crypto.Data;
    
    class Conta {
        Scanner sc = new Scanner(System.in);
        String iniciar;
        String titular;
        String agencia;
        int data_abertura;
        int saque;
        int deposito;
        int num_iden;
        int opc;
        double rendimento;
        double saldo;
        
    
    
    // MÃ©todo Construtor //
    
    public Conta(String titular, String agencia, int data_abertura, int num_iden, int saque, double saldo) {
    this.titular = titular;
    this.agencia = agencia;
    this.data_abertura = data_abertura;
    this.num_iden = num_iden;
    this.saque = saque;
    this.deposito = deposito;
    this.saldo = saldo;
    this.rendimento = rendimento;
    
    

}
public String returntitular(){
    return this.titular;
}
public String returnagencia(){
    return this.agencia;
}
public int returndata_abertura(){
    return this.data_abertura;
}
public int returnnum_iden(){
    return this.num_iden;
}
public int returnsaque(){
    return this.saque;
}
public int returndeposito(){
    return this.deposito;
}
public double returnrendimento(){
    return this.rendimento;
}
public double returnsaldo(){
    return this.saldo;
}

    void saldo(){
        System.out.println("Informe o seu saldo: ");
        saldo = sc.nextDouble();
    }
    void saque(){
        System.out.println("Informe o valor que voce deseja sacar: ");
    }
    void depositar(){
        System.out.println("Informe o valor que voce deseja depositar");
    }
    void iniciar(){
        System.out.println("Ola, seja bem-vindo (a) ao Banco do Brasil");
    }
    void opc(){
        System.out.println(" Qual operacao voce deseja realizar: \n 1-Saldo: \n 2-Saque: \n 3-Deposito: \n 4-Rendimento: ");
        opc = sc.nextInt();
    


        
        
        switch(opc) {
    
            case 1:
            System.out.println("Informe o seu saldo: ");
            saldo = sc.nextDouble();
            break;
    
            case 2:
            System.out.println("Informe o valor que voce deseja sacar: ");
            saque = sc.nextInt();
            break;
    
            case 3:
            System.out.println("Informe o valor que voce deseja depositar : ");
            deposito = sc.nextInt();
            break;
    
            case 4: 
            System.out.println("O rendimento do seu dinheiro é 0.5% ao mes ");
            break;
    
        }
    }
    }    

