package br.com.vinicius.app;

import br.com.vinicius.modelo.Carro;
import br.com.vinicius.modelo.Pessoa;

// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
     static void main() {
        ArrayList<Carro> listaDeCarros = new ArrayList<>(10);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>(10);

        // Carro[] estoque = new Carro[3];

        Pessoa p3 = new Pessoa("Giovanna", 18,2007);
        Pessoa p2 = new Pessoa("Vinicius", 18, 2007);
        Pessoa p1 = new Pessoa("Daniel", 25,2001);
        Carro c2 = new Carro("Ford", "ká", 2009,"Preto");
        Carro c1 = new Carro("BMW", "C8", 2017, "Azul", p1);
        Carro c3 = new Carro("Pegeout", "208", 2014, "Prata", p2);
        Carro c4 = new Carro("Chevrolet", "Camaro", 2005, "Amarelo", p3);

//        estoque[0] = c1;
//        estoque[1] = c2;
//        estoque[2] = c3;
//        estoque[3] = c4;

//        for (int i = 0; i < estoque.length; i++) {
//            if(estoque[i] != null){
//                estoque[i].exibirDados();
//            }
//        }

       listaDeCarros.add(c1);
        listaDeCarros.add(c2);
        listaDeCarros.add(c3);
        listaDeCarros.add(c4);
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
       listaDePessoas.add(p3);

      System.out.println("-----------------------------");
        System.out.println("Total de Pessoas no sistema: " + listaDePessoas.size());

        for (Carro c: listaDeCarros){
           c.exibirDados();
        }

        System.out.println("-----------------------------");
        System.out.println("Total de Carros no sistema: " + listaDeCarros.size());

    }
}
