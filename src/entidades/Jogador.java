package entidades;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jogador {
    Scanner in = new Scanner(System.in);
    Random sorteio = new Random();
    // Atributos
    private String nome;
    private Carta carta;
    private Carta influencia2;
    private boolean permitir;
    private int saldo;
    private int vida;
    // Construtores

    public Jogador(String nome, Carta carta, int saldo) {
        this.nome = nome;
        this.carta = carta;
        this.saldo = saldo;
    }
    // Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Carta getInfluencia2() {
        return influencia2;
    }

    public void setInfluencia2(Carta influencia2) {
        this.influencia2 = influencia2;
    }

    public boolean isPermitir() {
        return permitir;
    }

    public void setPermitir(boolean permitir) {
        this.permitir = permitir;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    // Métodos Públicos
    public void renda() {
        this.setSaldo(this.getSaldo() + 1);
        System.out.println(this.getNome() + " recebeu 1 moeda do Tesouro Central!");
    }
    public void ajudaExterna(Jogador jogador) {
        System.out.print(this.getNome() + " está pedindo ajuda externa. Deseja permitir [s/n]? ");
        char resPermissao = in.next().charAt(0);
        if (resPermissao == 's' || resPermissao == 'S') {
            jogador.setPermitir(true);
        }

        if(jogador.isPermitir()) {
            this.setSaldo(this.getSaldo() + 2);
            System.out.println(this.getNome() + " recebeu 2 moedas do Tesouro Central!");
        } else {
            System.out.println(this.getNome() + " foi bloqueado por " + jogador + " com o Duque!");
        }
    }
    public void golpeEstado(Jogador jogador, Carta carta) {
        if (jogador.getCarta().equals(carta)) {
            jogador.setVida(jogador.getVida() - 1);
            this.setSaldo(this.getSaldo() - 7);
            System.out.println(this.getNome() + " deu um golpe de estado na carta " + carta + " de " + jogador.getNome() + "!");
        } else {
            this.setSaldo(this.getSaldo() - 7);
            System.out.println(this.getNome() + " falhou em um golpe de estado na carta " + carta + " de " + jogador.getNome() + "!");
        }
    }
    public void taxar() {
        this.setSaldo(this.getSaldo() + 3);
        System.out.println(this.getNome() + " taxou 3 moedas do Tesouro Central");
    }
    public void assassinar(Jogador jogador) {
        jogador.setVida(this.getVida() - 1);
        this.setSaldo(this.getSaldo() - 3);
        System.out.println("Uma influência de " + jogador.getNome() + " foi assassinada por " + this.getNome() + "!");
    }
    public void bloquear(){
        System.out.println(getNome() + " bloqueou sua tentativa com a Condessa!");
    }
    public void extorquir(Jogador jogador) {
        jogador.setSaldo(jogador.getSaldo() - 2);
        this.setSaldo(this.getSaldo() + 2);
        System.out.println(this.getNome() + " roubou 2 moedas de " + jogador.getNome() + "!");
    }
    public void trocarUma(Carta carta){
        int sorteia = sorteio.nextInt(15);
    }
    public void trocarDuas(Carta carta1, Carta carta2){

    }
    public void permitir() {
        this.setPermitir(true);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                " | Carta: " + this.getCarta() +
                " | Saldo: " + this.getSaldo();
    }

}
