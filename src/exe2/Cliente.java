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

}
