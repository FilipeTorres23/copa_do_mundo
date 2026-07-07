package controller;

import java.util.ArrayList;

import exception.EscalacaoException;
import model.Jogador;
import model.Selecao;

public class SelecaoController {
    private Selecao selecaoUsuario;

    public SelecaoController () {
        this.selecaoUsuario = new Selecao();
        selecaoUsuario.setPais("Time da casa");
    }

    public Selecao getSelecao() {
        return selecaoUsuario;
    }
    
    /**
     * Adiciona um jogador na seleção do usuário.
     *
     * Antes da inserção são verificadas regras como:
     * limite máximo de jogadores e disponibilidade da posição.
     *
     * @param jogador jogador escolhido pelo usuário
     */
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
    
    /**
     * Verifica se a seleção já possui o limite máximo
     * de jogadores permitidos.
     *
     * @return true caso possua 11 jogadores,
     *         false caso ainda possa adicionar
     */
    private boolean limiteDeJogadoresAtingido () {
        return selecaoUsuario.getEscalacao().size() >= 11;
    }

    public boolean selecaoCompleta() {
        return selecaoUsuario.getEscalacao().size() == 11;
    }
}
