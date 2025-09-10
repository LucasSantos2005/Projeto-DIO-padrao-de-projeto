package puro.decorator;

public class Massaintegral extends pizzaDecorator{
    Massaintegral (Pizza p){
        super(p);
    }
    public int preco(){
        return pizzaDecorada.preco()+5;
    }
}
