package controller;

import java.util.ArrayList;
import model.Jogador;
import model.Selecao;

public class SelecaoController {
    private Selecao selecaoUsuario;

    
    public SelecaoJogadorController () {
    
    }
    
    public void adicionarJogador (Jogador jogador) {
        // Aqui ocorre o tratamento de excecao
        selecaoUsuario.adicionarJogador(jogador);
    }
    
}
