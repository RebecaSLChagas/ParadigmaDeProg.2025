import exe1.Aluno;

import java.sql.SQLOutput;

public class MainAluno {
    public static void main(String[] args){
        //instanciar a classe Aluno -> objeto
        Aluno obj1 = new Aluno(); //chama o construtor
        System.out.println("Nome " + obj1.nome, " Média " + obj1.notaFinal());
        Aluno obj2 = new Aluno(123, "Tiago", 19, 5.4f, 8.9f);
        System.out.println("Nome " + obj2.nome, " Média " + obj2.notaFinal());



    }
}
