package model;

import service.SorteioService;
import java.util.Random;

public class Partida {
    private Selecao usuario;
    private Selecao adversario;
    private SorteioService sorteador;

    public Partida(Selecao usuario, Selecao adversario) {
        this.usuario = usuario;
        this.adversario = sorteador.sortearSelecao();
    }

    public Selecao getUsuario() {
        return usuario;
    }

    public void setUsuario(Selecao usuario) {
        this.usuario = usuario;
    }

    public Selecao getAdversario() {
        return adversario;
    }

    public void setAdversario(Selecao adversario) {
        this.adversario = adversario;
    }
    
    public ResultadoPartida jogar () {
        Random sortearVitoria = new Random();
        
        
    }
}
