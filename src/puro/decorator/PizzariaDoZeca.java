package puro.decorator;
import java.util.HashMap;
public class PizzariaDoZeca  {
    public static void main(String[] args){
        HashMap<String,Integer> ingredientes = new HashMap<>();
        ingredientes.put("massa",10);
        ingredientes.put("muzzarela",20);
        ingredientes.put("tomate",5);
        ingredientes.put("Mangericao",5);

        Pizza margarita = new PizzaDoZeca (ingredientes);

        Pizza minhaSuperMargarita = new pizzaGigante(new BordaRecheada(new Massaintegral(margarita)));
        System.out.println("minha pizza custa "+ minhaSuperMargarita.preco());


    }

}
