package puro.decorator;

public class BordaRecheada extends pizzaDecorator {

    BordaRecheada(Pizza p){
        super(p);
    }
    public int preco() {
        return pizzaDecorada.preco()+10;
    }

}
