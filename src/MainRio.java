import exe4.Rio;

public class MainRio {
    public static void main(String args[]){
        Rio obj1 = new Rio();
        Rio obj2 = new Rio("aleatório", 10, true);
        System.out.println(obj1.exibeDetalhes());
        System.out.println(obj2.exibeDetalhes());

        obj2.chover(5);
        obj2.ensolarar(3);
        obj2.poluir();
        obj2.limpar();
        obj2.poluir();

        System.out.println(obj2.exibeDetalhes());
    }
}
