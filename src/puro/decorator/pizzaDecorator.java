package puro.decorator;

public abstract class pizzaDecorator implements Pizza {
    Pizza pizzaDecorada;

    pizzaDecorator(Pizza pizza){
        pizzaDecorada = pizza;
    }
}
