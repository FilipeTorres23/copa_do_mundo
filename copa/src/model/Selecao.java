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
    
    /* 
    
     ----------METODOS A ADICIONAR--------
    
    calcularOverAllTotalDefesa {
            Aqui, a gente pega o overall de defesa de cada jogador
            Ai a gente faz uma media normal /11
    }   
    
     calcularOverAllTotalAtaque {
            Faz-se o mesmo que no metodo acima
            Porem, aqui a gente usa o overall de ataque
    }

    carregarArquivo() {
        Recebemos as informacoes da selacao do arquivo
    
        !!!!! ESSA FUNÇAO TEM QUE ESTAR AQUI MESMO?? !!!!!
    }
    
    adicionarJogador() {
        Pega e adiciona um jogador a selecao
        Vai ser mais usada quando o usuario montar a selecao dele
        As outras selecoes ja sao pre-montadas no arquivo
    }

    */
}