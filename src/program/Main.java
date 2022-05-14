package program;

import entidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("            COUP             ");
        System.out.println("-----------------------------");
        System.out.print("Quantidade de Jogadores: ");
        int qtdJogadores = in.nextInt(); in.nextLine(); // Esse segundo in.nextLine() serve para receber a quebra de linha extra que o nextInt() deixa.

        Jogador[] jogador = new Jogador[qtdJogadores];
        String nome, vida1, vida2;

        for (int i=0; i<jogador.length; i++) {
            System.out.println();
            System.out.print("Nome: ");
            nome = in.nextLine();
            System.out.print("Influência 01: ");
            vida1 = in.nextLine();
            System.out.print("Influência 02: ");
            vida2 = in.nextLine();
            jogador[i] = new Jogador(nome, vida1, vida2, 2,2);
        }

        jogador[0].ajudaExterna(jogador[1]);

//        jogador[0].status();
//        jogador[1].status();
//        jogador[0].taxar();
//        jogador[1].taxar();
//        jogador[0].status();
//        jogador[1].status();
//        jogador[0].assassinar(jogador[1]);
//        jogador[0].status();
//        jogador[1].status();
//        jogador[1].extorquir(jogador[0]);
//        jogador[0].status();
//        jogador[1].status();
//        jogador[1].golpeEstado(jogador[0], "Assassino");

        /*
        Carta
            Tipo
                Duque
                Condessa
                Assassino
                Capitão
                Embaixador
		*/

        /*
        for (int i=0; i<3; i++){
            int randomNum = (int)(Math.random() * 15);  // 0 to 100
            tiago.setInfluencia(classico[randomNum]);
        }*/

    }
}