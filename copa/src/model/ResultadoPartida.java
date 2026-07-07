package model;

public class ResultadoPartida {
    private Selecao adversario;
    private String placar;
    private boolean vitoria;

     /**
     * Cria um resultado de partida.
     *
     * @param adversario seleção adversária da partida
     * @param placar placar final da partida
     * @param vitoria indica se o usuário venceu
     */
    public ResultadoPartida(Selecao adversario, String placar, boolean vitoria) {
        this.adversario = adversario;
        this.vitoria = vitoria;
        this.placar = placar;
    }
    
    public Selecao getAdversario() {
        return adversario;
    }

    public void setAdversario(Selecao adversario) {
        this.adversario = adversario;
    }

    public boolean getVitoria() {
        return vitoria;
    }

    public void setVitoria(boolean vitoria) {
        this.vitoria = vitoria;
    }

    public String getPlacar() {
        return placar;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }
    
}
