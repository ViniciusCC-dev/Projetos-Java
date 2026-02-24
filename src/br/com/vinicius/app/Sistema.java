package br.com.vinicius.app;

import br.com.vinicius.modelo.Carro;
import br.com.vinicius.modelo.Pessoa;

public class Sistema {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Vinicius";
        p1.idade = 18;
        p1.anoDeNasc = 2007;

        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Toro";
        c1.anoDeFabricacao = 2007;
        c1.cor = "Preto";
        c1.dono = p1;

        c1.exibirDados();

    }
}
