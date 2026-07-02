package model;

public class Jogador {
    private String nome;
    private int overallAtaque;
    private int overallDefesa;
    private String posicao;

    public Jogador(String nome, int overallAtaque, int overallDefesa, String posicao) {
        this.nome = nome;
        this.overallAtaque = overallAtaque;
        this.overallDefesa = overallDefesa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOverallAtaque() {
        return overallAtaque;
    }

    public void setOverallAtaque(int overallAtaque) {
        this.overallAtaque = overallAtaque;
    }

    public int getOverallDefesa() {
        return overallDefesa;
    }

    public void setOverallDefesa(int overallDefesa) {
        this.overallDefesa = overallDefesa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}