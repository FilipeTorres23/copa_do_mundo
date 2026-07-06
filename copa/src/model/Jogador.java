package model;

public class Jogador {
    private String nome;
    private int overall;
    private String posicao;

    public Jogador(String nome, int overall, String posicao) {
        this.nome = nome;
        this.overall = overall;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
