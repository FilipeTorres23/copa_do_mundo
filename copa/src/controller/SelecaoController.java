package controller;

import java.util.ArrayList;

import exception.EscalacaoException;
import model.Jogador;
import model.Selecao;

public class SelecaoController {
    private Selecao selecaoUsuario;

    public SelecaoController () {
        this.selecaoUsuario = new Selecao();
    }

    public Selecao getSelecao() {
        return selecaoUsuario;
    }
    
    public void adicionarJogador (Jogador jogador) throws EscalacaoException {
        if (limiteDeJogadoresAtingido()) {
            throw new EscalacaoException("A seleção já possui 11 jogadores.");
        } 

        System.out.println("posicao" + jogador.getPosicao());
        if(!posicaoDisponivel(jogador.getPosicao())) {
            throw new EscalacaoException("Limite de jogadores da posicao " + jogador.getPosicao() + "atingido");
        }
        
        selecaoUsuario.adicionarJogador(jogador);
    }

    private boolean posicaoDisponivel(String posicao) {
        int quantidade = 0;

        for (Jogador jogador : selecaoUsuario.getEscalacao()) {
            if (jogador.getPosicao().equalsIgnoreCase(posicao)) {
                System.out.println(quantidade);
                quantidade++;
            }
                
                
        }

        switch (posicao) {
            case "gk":
                System.out.println(quantidade <= 1);
                return quantidade < 1;
            case "za":
                return quantidade < 2;
            case "ld":
                return quantidade < 1;
            case "le":
                return quantidade < 1;
            case "mc":
                return quantidade < 3;
            case "at":
                return quantidade < 3;
        }

        return true;
    }
    
    
    private boolean limiteDeJogadoresAtingido () {
        return selecaoUsuario.getEscalacao().size() >= 11;
    }
}
