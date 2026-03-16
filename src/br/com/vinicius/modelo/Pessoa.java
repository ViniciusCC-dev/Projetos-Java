    package br.com.vinicius.modelo;

    public class Pessoa {
        private String nome;
        private int idade;
        private int anoDeNasc;

        public Pessoa(String nome, int idade, int anoDeNasc) {
            this.setNome(nome);
            this.setIdade(idade);
            this.setAnoDeNasc(anoDeNasc);
        }
        public void exibirInfo(){
            System.out.println("--------Dados-Do-Cliente--------");
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Ano de nascimento: " + getAnoDeNasc());
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            if (nome != null && !nome.isEmpty() && nome.length() >= 3) {
                this.nome = nome;
            } else {
                System.out.println("ERRO: O nome fornecido é inválido e não foi salvo.");
            }
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            if (idade > 0 && idade < 120 ){
                this.idade = idade;
            }else{
                System.out.println("ERRO: Idade inválida (" + idade + ")! O valor não foi alterado.");
            }
        }

        public int getAnoDeNasc() {
            return anoDeNasc;
        }

        public void setAnoDeNasc(int anoDeNasc) {
            if (anoDeNasc > 1890 && anoDeNasc < 2026){
                this.anoDeNasc = anoDeNasc;
            }else {
                System.out.println("ERRO: Data de Nascimento Invalida (" + anoDeNasc + ")! O valor nao foi alterado");
            }
        }
    }