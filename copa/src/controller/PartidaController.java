package controller;

import model.Partida;
import model.ResultadoPartida;
import model.Selecao;

public class PartidaController {

    /**
     * Executa uma partida entre duas seleções.
     *
     * Cria uma partida e solicita sua simulação.
     *
     * @param usuario seleção do jogador
     * @param adversario seleção adversária
     *
     * @return resultado da partida
     */
    public ResultadoPartida jogar(Selecao usuario) {
        Partida partida = new Partida(usuario);
        return partida.jogar();
    }

}