package br.com.vinicius.modelo;

public class Pessoa {
    public String nome;
    public int idade;
    public int anoDeNasc;

    public void exibirInfo(){
        System.out.println("--------Dados-Do-Cliente--------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento: " + anoDeNasc);
    }
}
