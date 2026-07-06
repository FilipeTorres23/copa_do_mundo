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
    
    public void definirOverAllTotal (Jogador jogador) {
        this.overrAllTotal += jogador.getOverall();
    }
    
    
    public void adicionarJogador(Jogador jogador) {
        escalacao.add(jogador);
        definirOverAllTotal(jogador);
    }

    public int getOverrAllTotal() {
        return overrAllTotal;
    }
}
