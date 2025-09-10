package subsistema2.cep;

import puro.singleton.SingletonEarger;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }
    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "ararquara";
    }
    public String recuperarEstado(String cep){
        return "MG";
    }
}
