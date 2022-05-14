package entidades;

public class Solicitacoes {
    // Atributos
    private Jogador solicitante;
    private Jogador autorizador;
    private boolean permitir;
    private boolean contestar;
    private boolean bloquear;
    // Construtores
    public Solicitacoes(Jogador solicitante, Jogador autorizador) {
        this.solicitante = solicitante;
        this.autorizador = autorizador;
    }

    public Solicitacoes() {
    }

    // Métodos Especiais

    public Jogador getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Jogador solicitante) {
        this.solicitante = solicitante;
    }

    public Jogador getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(Jogador autorizador) {
        this.autorizador = autorizador;
    }

    public boolean isPermitir() {
        return permitir;
    }

    public void setPermitir(boolean permitir) {
        this.permitir = permitir;
    }

    public boolean isContestar() {
        return contestar;
    }

    public void setContestar(boolean contestar) {
        this.contestar = contestar;
    }

    public boolean isBloquear() {
        return bloquear;
    }

    public void setBloquear(boolean bloquear) {
        this.bloquear = bloquear;
    }

    // Métodos Públicos

    public void permitir() {
        this.permitir = true;
    }

    public void contestar() {
        this.contestar = true;
    }

    public void bloquear() {
        this.bloquear = true;
    }
}
