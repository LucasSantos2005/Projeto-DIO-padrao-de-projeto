package puro.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Esta se movendo agressivamente...");
    }
}
