    package br.com.vinicius.app;

    import br.com.vinicius.modelo.*;

    import java.util.ArrayList;

    public class Sistema {
        public static void main(String[] args){
            ArrayList<Veiculo> listaDeVeiculo = new ArrayList<>(10);
            ArrayList<Pessoa> listaDePessoas = new ArrayList<>(10);

            String alvo = "208";

            int anoMaisAntigo = 9999;
            Veiculo veiculoVovo = null;

            Veiculo[] estoque = new Veiculo[12];
            Pessoa p1 = new Pessoa("Daniel", 25,2001);
            Pessoa p2 = new Pessoa("Vinicius", 18, 2007);
            Pessoa p3 = new Pessoa("Giovanna", 18,2007);
            Pessoa p4 = new Pessoa("Afonso", 69,1957);
            Pessoa p5 = new Pessoa("Luiz", 35,1991);
            Pessoa p6 = new Pessoa("Carlos", 26,2000);
            Pessoa p7 = new Pessoa("Augusto", 52,1973);
            Pessoa p8 = new Pessoa("Antonio", 45,1981);
            Pessoa p9 = new Pessoa("Maria", 57,1969);
            Pessoa p10 = new Pessoa("Juan", 32,1993);


            Caminhao cam1 = new Caminhao("Volvo", "FH 540", 1959, "kjh-2241", "Branco", 550000, p4,50941);
            Caminhao cam2 = new Caminhao("Mercedes-Benz", "Actros 2651", 1956, "dfh-2652", "Azul", 560000, p7, 6700);
            Caminhao cam3 = new Caminhao("Scania", "R450", 1981, "iyt-5078", "Prata", 688000,p8, 70000);
            Caminhao cam4 = new Caminhao("Mercedes-Benz", "710", 2010, "hkj-4595", "Azul", 170000, 6700);


            Moto mot1 = new Moto("Honda", "Hornet", 2019, "vxc-1536","Branco", 57900, p1, 100);
            Moto mot2 = new Moto("Honda ", "CG 160", 2025, "iou-6972", "Preto", 18700, p5,160);
            Moto mot3 = new Moto("Yamaha", "Lander 250",2006 , "ads-2345", "Verde", 29290, p10,250);
            Moto mot4 = new Moto("Suzuki", "GSX-S 1000", 2025, "abc-1234", "Azul", 79900, 1000);

            Carro c1 = new Carro ("BMW", "C8", 2017, "zxc-1531", "Azul",892100, p2,2);
            Carro c2 = new Carro ("Ford", "ká", 2009, "mvb-0789","Preto", 45123, p6,4);
            Carro c3 = new Carro ("Pegeout", "208", 2014, "ity-1325", "Prata", 91900,p9, 4);
            Carro c4 = new Carro ("Chevrolet", "Camaro", 2005, "vad-3890", "Amarelo", 532340, 2);

            estoque[0] = c1;
            estoque[1] = c2;
            estoque[2] = c3;
            estoque[3] = c4;
            estoque[4] = cam1;
            estoque[5] = cam2;
            estoque[6] = cam3;
            estoque[7] = cam4;
            estoque[8] = mot1;
            estoque[9] = mot2;
            estoque[10] = mot3;
            estoque[11] = mot4;


            for (int i = 0; i < estoque.length; i++) {
                if(estoque[i] != null) {
                    if (estoque[i].getAnoDeFabricacao() < anoMaisAntigo) {
                        anoMaisAntigo = estoque[i].getAnoDeFabricacao();
                        veiculoVovo = estoque[i];
                    }
                    if (estoque[i].getModelo().equals(alvo)) {
                        System.out.println("O alvo foi encontrado na posição [" + i + "]");
                    }
                }
            }
            if (veiculoVovo != null) {
                System.out.println("O veiculo mais antigo da frota é o [" + veiculoVovo.getMarca() + "] , [" + veiculoVovo.getModelo() + "] do ano: " + veiculoVovo.getAnoDeFabricacao());
            }

            listaDeVeiculo.add(c1);
            listaDeVeiculo.add(c2);
            listaDeVeiculo.add(c3);
            listaDeVeiculo.add(c4);

            listaDeVeiculo.add(cam1);
            listaDeVeiculo.add(cam2);
            listaDeVeiculo.add(cam3);
            listaDeVeiculo.add(cam4);

            listaDeVeiculo.add(mot1);
            listaDeVeiculo.add(mot2);
            listaDeVeiculo.add(mot3);
            listaDeVeiculo.add(mot4);

            listaDePessoas.add(p1);
            listaDePessoas.add(p2);
            listaDePessoas.add(p3);
            listaDePessoas.add(p4);
            listaDePessoas.add(p5);
            listaDePessoas.add(p6);
            listaDePessoas.add(p7);
            listaDePessoas.add(p8);
            listaDePessoas.add(p9);
            listaDePessoas.add(p10);

            System.out.println("-----------------------------");
            System.out.println("Total de Pessoas no sistema: " + listaDePessoas.size());

            for (Veiculo v: listaDeVeiculo){
                v.exibirDados();
                System.out.printf("Valor do seguro: R$ %.2f%n" , v.calcularSeguro());
            }

            System.out.println("-----------------------------");
            System.out.println("Total de Veículos no sistema: " + listaDeVeiculo.size());
            System.out.println("-----------------------------");

            GeradorDeImposto gerador = new  GeradorDeImposto();

            gerador.registrar(c1);
            gerador.registrar(c2);
            gerador.registrar(c3);
            gerador.registrar(c4);

            gerador.registrar(cam1);
            gerador.registrar(cam2);
            gerador.registrar(cam3);
            gerador.registrar(cam4);

            gerador.registrar(mot1);
            gerador.registrar(mot2);
            gerador.registrar(mot3);
            gerador.registrar(mot4);

            System.out.println("-----------------------------");
            System.out.printf("Total acumulado: R$%.2f%n" , gerador.getTotalDosImpostos());

        }
    }
