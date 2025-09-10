package puro.strategy;

import puro.decorator.*;
import puro.facade.Facade;
import puro.singleton.SingletonEarger;
import puro.singleton.SingletonLazy;
import puro.singleton.SingletonLazyHolder;

public class test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEarger eager = SingletonEarger.getInstancia();
        System.out.println(eager);
        eager = SingletonEarger.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println("strategy....");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defencivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo= new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defencivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("facade");

        Facade facade= new Facade();
        facade.migrarCliente("Lucas","52852545 ");

    }
}
