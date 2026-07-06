package controller;

import java.util.ArrayList;
import model.Jogador;
import model.Selecao;

public class SelecaoController {
    private Selecao selecaoUsuario;

    public SelecaoController () {
    
    }
    
    public void adicionarJogador (Jogador jogador) {
        // Aqui ocorre o tratamento de excecao
        if (!limiteDeJogadoresAtingido()) {
            selecaoUsuario.adicionarJogador(jogador);
        } 
    }
    
    
    private boolean limiteDeJogadoresAtingido () {
        if (selecaoUsuario.getEscalacao().size() == 11) {
            return true;
        }
        
        return false;
    }
}
