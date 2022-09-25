package program;

import entidades.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sorteio = new Random();

        System.out.println("---------------------------------------");
        System.out.println("         COUP BY TIAGO CABRAL          ");
        System.out.println("---------------------------------------");
        System.out.println("Escolha o modo de jogo: ");
        System.out.println("---");
        System.out.println("[1] Clássico");
        System.out.println("[2] Expansão");
        System.out.println("---");
        System.out.print("Resposta: ");
        int option = in.nextInt();

        System.out.println();

        /* Instanciando as cartas para serem distribuídas aos jogadores */
        Carta duque = new Carta("Duque");
        Carta condessa = new Carta("Condessa");
        Carta assassino = new Carta("Assassino");
        Carta embaixador = new Carta("Embaixador");
        Carta capitao = new Carta("Capitão");
        Carta inquisitor = new Carta("Inquisitor");

        /* Preparando um array para fazer o sorteio relacionando o número sorteado com os índices deste array */
        Carta[] carta = new Carta[15];

        if (option == 1) {
            // Esse modo não contém a carta inquisitor
            carta = new Carta[]{duque, condessa, assassino, embaixador, capitao, duque, condessa, assassino, embaixador, capitao, duque, condessa, assassino, embaixador, capitao};
        } else if (option == 2) {
            // Esse modo contém a carta inquisitor
            carta = new Carta[]{duque, condessa, assassino, inquisitor, capitao, duque, condessa, assassino, inquisitor, capitao, duque, condessa, assassino, inquisitor, capitao};
        }

        /* Configuração de jogo */
        System.out.print("Nº de Jogadores: ");
        int numJogadores = in.nextInt();
        in.nextLine(); // Esse "in.nextLine()" serve para receber a quebra de linha que sobrou do in.nextInt() anterior
        System.out.println("---");

        System.out.println();

        Jogador[] jogadores = new Jogador[numJogadores]; // Definindo o tamanho do array conforme escolha do usuário

        /* Preenchimento dos indices do array */
        for (int i=0; i<jogadores.length; i++) {
            System.out.print("Nome: ");
            String nome = in.nextLine();

            int sorteia = sorteio.nextInt(15); // Primeiro número randômico sendo sorteado
            Carta cartas = carta[sorteia];

            int saldo = 7;

            jogadores[i] = new Jogador(nome, cartas, saldo);
        }

        System.out.println();

        for (Jogador j : jogadores) {
            System.out.println(j.toString());
        }

        jogadores[3].ajudaExterna(jogadores[2]);

        jogadores[0].golpeEstado(jogadores[4], carta[11]);

        System.out.println(jogadores[0]);

    }
}