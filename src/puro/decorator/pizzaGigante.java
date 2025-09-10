package puro.decorator;

public class pizzaGigante extends pizzaDecorator{

    pizzaGigante(Pizza p ){
        super(p);
    }
    public int preco(){
        return (int) (pizzaDecorada.preco() *1.3);
    }
}
