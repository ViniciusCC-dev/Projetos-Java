package br.com.vinicius.app;

import br.com.vinicius.modelo.Carro;
import br.com.vinicius.modelo.Pessoa;

public class Sistema {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinicius", 18,2007);

        Carro c1 = new Carro("Fiat", "Toro", 2021, "Prata", p1);

        c1.exibirDados();

    }
}
