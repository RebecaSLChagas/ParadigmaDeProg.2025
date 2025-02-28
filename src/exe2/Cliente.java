package exe2;
public class Cliente {
    public int nroAgencia, nroConta; //tipo primitivo
    public String nome; //tipo de classe
    public float saldo; //tipo primitivo
    //método construtor sem parâmetro, para criar objeto vazio
    public Cliente(){
        this.nome = "sem nome";
    }
    // método construtor com parâmetros
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo){ // esse saldo vai ser quem será atribuido
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo; //saldo do objeto que chamou o construtor
    }
    //realizar depósito
    public void depositar(float x){
        this.saldo += x;
        System.out.println("Depósito realizado");
    }
    public void exibirDetalhes(){
        System.out.println(
                "Nro. Conta: " + this.nroConta
                + " Nro. Agência: " + this.nroAgencia
                + " Nome: " + this.nome
                + " Saldo " + this.saldo);
    }
    // sacar o saldo
    public void sacar(float x){
        if (this.saldo >= x){
            this.saldo -= x;
            System.out.println("Saque realizado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
