package controller;

import java.util.ArrayList;
import model.Jogador;
import model.Selecao;

public class SelecaoController {
    private Selecao selecaoUsuario;

    
    public SelecaoController () {
        this.selecaoUsuario = new Selecao();
    }
    
    public void adicionarJogador (Jogador jogador) {
        // Aqui ocorre o tratamento de excecao
        selecaoUsuario.adicionarJogador(jogador);
    }

    public void getSelecao() {
        System.out.println("SELECAO USUARIO");
        for(Jogador jogador : selecaoUsuario.getEscalacao()) {
            System.out.println(jogador.getNome());
        }
    }
    
}
