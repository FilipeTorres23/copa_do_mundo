package model;

import java.util.ArrayList;

public class Selecao {
    private String pais;
    private int ano;
    private ArrayList<Jogador> escalacao = new ArrayList<>();
    private int overrAllTotal;

    
    public Selecao(String pais, int ano, ArrayList<Jogador> escalacao) {
        this.pais = pais;
        this.ano = ano;
        this.escalacao = escalacao;
        this.overrAllTotal = 0;
    }

    public Selecao(){}

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
    
    /**
     * Soma o overall de um jogador ao overall total da seleção.
     *
     * @param jogador jogador utilizado para atualizar o overall total
     */
    public void definirOverAllTotal (Jogador jogador) {
        this.overrAllTotal += jogador.getOverall();
    }
    
    /**
     * Adiciona um jogador à escalação da seleção.
     *
     * O método também atualiza o overall total da seleção
     * utilizando o overall do jogador inserido.
     *
     * @param jogador jogador que será adicionado à seleção
     */
    public void adicionarJogador(Jogador jogador) {
        escalacao.add(jogador);
        definirOverAllTotal(jogador);
    }

    public int getOverrAllTotal() {
        return overrAllTotal;
    }
}
