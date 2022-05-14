package entidades;

public class Acao {
    private Jogador desafiante;
    private Jogador desafiador;
    private boolean aprovada;

    public Acao() {
        this.desafiante = desafiante;
        this.desafiador = desafiador;
        this.aprovada = false;
    }

    public Jogador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Jogador desafiante) {
        this.desafiante = desafiante;
    }

    public Jogador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Jogador desafiador) {
        this.desafiador = desafiador;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void solicitarDesafio() {

    }

    public void desafio() {

    }

}
