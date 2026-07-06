package controller;

import model.ResultadoPartida;
import model.Selecao;
import model.Torneio;

public class TorneioController {

    private Torneio torneio;
    private PartidaController partidaController;
    private JogoController jogoController;

    public TorneioController() {

        torneio = new Torneio(0,0,0,"Fase de Grupos");
        partidaController = new PartidaController();
        jogoController = new JogoController();

    }

    public ResultadoPartida jogarPartida(Selecao usuario) {
        ResultadoPartida resultado = partidaController.jogar(usuario);

        if(resultado.getVitoria())
            torneio.registrarVitoria();
        else
            torneio.registrarDerrota();

        return resultado;
    }

    public boolean acabou() {
        return torneio.acabou();
    }

    public Torneio getTorneio() {
        return torneio;
    }

}