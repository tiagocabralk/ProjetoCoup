package entidades;

import java.util.Scanner;

public class Jogador {
    Scanner in = new Scanner(System.in);
    // Atributos
    private String nome;
    private String influencia1;
    private String influencia2;
    private boolean permitir;
    private int saldo;
    private int vida;
    // Construtores
    public Jogador(String nome, String influencia1, String influencia2, int vida, int saldo) {
        this.nome = nome;
        this.influencia1 = influencia1;
        this.influencia2 = influencia2;
        this.vida = 2;
        this.saldo = 2;
    }

    public Jogador(String nome, String influencia1, String influencia2) {
        this.nome = nome;
        this.influencia1 = influencia1;
        this.influencia2 = influencia2;
    }

    // Métodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInfluencia1() {
        return influencia1;
    }
    public void setInfluencia1(String influencia1) {
        this.influencia1 = influencia1;
    }
    public String getInfluencia2() {
        return influencia2;
    }
    public void setInfluencia2(String influencia2) {
        this.influencia2 = influencia2;
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

    public boolean isPermitir() {
        return permitir;
    }

    public void setPermitir(boolean permitir) {
        this.permitir = permitir;
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
    public void golpeEstado(Jogador jogador, String golpe) {
        if (jogador.getInfluencia1().equals(golpe) || jogador.getInfluencia2().equals(golpe)) {
            jogador.setVida(jogador.getVida() - 1);
            this.setSaldo(this.getSaldo() - 7);
            System.out.println(this.getNome() + " deu um golpe de estado na carta " + golpe + " de " + jogador.getNome() + "!");
        } else {
            this.setSaldo(this.getSaldo() - 7);
            System.out.println(this.getNome() + " falhou em um golpe de estado na carta " + golpe + " de " + jogador.getNome() + "!");
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
    public void trocar(String a, String b){
        if(this.getVida() == 2) {
            this.setInfluencia1("Embaixador");
            this.setInfluencia2("Assassino");
            System.out.println(this.getNome() + " trocou as cartas com sucesso!");
        } else {
            this.setInfluencia1("Capitão");
            System.out.println(this.getNome() + " trocou a carta com sucesso!");
        }
    }
    public void permitir() {
        this.setPermitir(true);
    }
    public void status() {
        System.out.println(
                "nome='" + this.getNome() + '\'' +
                ", influencia1='" + this.getInfluencia1() + '\'' +
                ", influencia2='" + this.getInfluencia2() + '\'' +
                ", saldo=" + this.getSaldo() +
                ", vida=" + this.getVida() +
                '}');
    }

}
