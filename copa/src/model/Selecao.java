package model;

import java.util.ArrayList;

public class Selecao {
    private String pais;
    private int ano;
    private ArrayList<Jogador> escalacao = new ArrayList<>();
    private int overrAllTotalDefesa;
    private int overrAllTotalAtaque;

    public Selecao(String pais, int ano, ArrayList<Jogador> escalacao) {
        this.pais = pais;
        this.ano = ano;
        this.escalacao = escalacao;
    }
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Jogador> getEscalacao() {
        return escalacao;
    }

    public void setEscalacao(ArrayList<Jogador> escalacao) {
        this.escalacao = escalacao;
    }

    public int getOverrAllTotalDefesa() {
        return overrAllTotalDefesa;
    }

    public int getOverrAllTotalAtaque() {
        return overrAllTotalAtaque;
    }

    /**
     * Calcula o OverAll total da selecao pela media do OverAll dos jogadores
     * @param jogador
     */
    private void calcularOverAllTotal(Jogador jogador) {
        this.overrAllTotalAtaque += (jogador.getOverallAtaque() / 11);
        this.overrAllTotalDefesa += (jogador.getOverallDefesa() / 11);
    }

    /**
     * Adiciona um jogador a selecao montada pelo usuario
     * @param jogador
     * @return
     */
    public boolean adicionarJogador(Jogador jogador) {
        return escalacao.add(jogador);
    }
}