package controller;

import model.Partida;
import model.ResultadoPartida;
import model.Selecao;

public class PartidaController {

    public ResultadoPartida jogar(Selecao usuario) {
        Partida partida = new Partida(usuario);
        return partida.jogar();
    }

}