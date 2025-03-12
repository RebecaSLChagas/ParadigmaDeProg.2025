import exe3.Produto;

public class MainProduto {
    public static void main(String args[]){
        //chama construtor sem parâmetro
        Produto obj1 = new Produto();
        //chama consrtutor com parâmetro
        Produto obj2 = new Produto(123,5,"Bola de Basquete",500);
        System.out.println(obj1.exibeDetalhes());
        System.out.println(obj2.exibeDetalhes());

        obj2.comprar(3);
        obj2.subir(50);
        obj2.vender(1);
        obj2.descer(560);
        System.out.println(obj2.exibeDetalhes());
    }
}
