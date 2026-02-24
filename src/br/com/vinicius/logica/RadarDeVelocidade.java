package br.com.vinicius.logica;

public class RadarDeVelocidade {
    static void main() {
        double  veloDoCarro = 88;
        double veloDaVia = 80;
        int multa = 0;
        boolean apreendido;
        if (veloDoCarro + (10/100) > veloDaVia) {
            System.out.println("Velocidade do carro está rapida, reduza levemente");
        }else if (veloDoCarro + (11/100) > veloDaVia || veloDoCarro + (20/100) < veloDaVia) {
            System.out.println("Velocidade do carro está maior que a velocidade permitida: multado");
            multa = 130;
            System.out.println("Sua multa foi de " + multa);
        } else if (veloDoCarro + (20/100) >= veloDaVia || veloDoCarro + (50/100) < veloDaVia) {
            System.out.println("Velocidade do carro muito acima do permitido: multado");
            multa = 195;
            System.out.println("Sua multa foi de " + multa);
        }else if (veloDoCarro + (50/100) >= veloDaVia) {
            System.out.println("Velocidade do carro em velocidade inconcebivel para a via: multado e apreendido");
            multa = 880;
            apreendido = true;
            System.out.println("Sua multa foi de " + multa);
        }
    }
}
