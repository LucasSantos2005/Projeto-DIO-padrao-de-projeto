package puro.decorator;
import java.util.HashMap;
public class PizzaDoZeca implements Pizza{
    HashMap<String,Integer>ingredientes;

    PizzaDoZeca(){ }

    PizzaDoZeca (HashMap<String, Integer>ingredientes){
        this.ingredientes = ingredientes;

    }
    public int preco(){
        int valor = 0;
        for (Integer i : ingredientes.values())
            valor+= i;
        return valor;
    }
}
