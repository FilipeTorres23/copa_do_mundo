package model;

public class Torneio {
    private int partidasJogadas;
    private int vitorias;
    private int derrotas;
    private String faseAtual;
    private boolean resultadoAtual; // true == vitoria  e false == derrota

    public Torneio(int partidasJogadas, int vitorias, int derrotas, String faseAtual) {
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.faseAtual = faseAtual;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getFaseAtual() {
        return faseAtual;
    }

    public void setFaseAtual(String faseAtual) {
        this.faseAtual = faseAtual;
    }
    
    /**
     * Registra uma vitória no campeonato.
     *
     * Atualiza a quantidade de vitórias,
     * partidas jogadas e a fase atual do torneio.
     */
    public void registrarVitoria () {
        this.vitorias += 1;
        this.resultadoAtual = true;
        this.partidasJogadas += 1;
        mudarFaseAtual();
    }
    
    /**
     * Registra uma derrota no campeonato.
     *
     * Atualiza a quantidade de derrotas,
     * partidas jogadas e a fase atual do torneio.
     */
    public void registrarDerrota () {
        this.derrotas += 1;
        this.resultadoAtual = false;
        this.partidasJogadas += 1;
        mudarFaseAtual();
    }

    /**
     * Atualiza a fase atual do campeonato de acordo
     * com a quantidade de partidas realizadas.
     */
    public void mudarFaseAtual () {
        
        switch (partidasJogadas) {
            case 1:
            
            case 2:
                
            case 3:
                this.faseAtual = "Fase de Grupos";
                break;
                
            case 4:
                this.faseAtual = "Oitavas de Final";
                break;
            
            case 5:
                this.faseAtual = "Quartas de Final";
                break;
                
            case 6:
                this.faseAtual = "Semifinais";
                break;
                
            case 7:
                this.faseAtual = "Final";
                break;
        }
    }
    
    /**
     * Verifica se o torneio foi encerrado.
     *
     * O torneio termina caso o usuário seja eliminado
     * na fase de grupos ou perca uma partida eliminatória.
     *
     * @return true caso o torneio tenha acabado,
     *         false caso ainda esteja em andamento
     */
    public boolean acabou () {
        
        if (this.partidasJogadas < 3) {
            return false;
        }
        
        // O usuario perdeu na fase de grupos
        if (this.partidasJogadas == 3 && this.vitorias < 2) {
            return true;
        }

        // fases eliminatórias:
        // derrota encerra
        if (!resultadoAtual) {
            return true;
        }

        // venceu a final
        if (partidasJogadas == 7) {
            return true;
        }
        
      return false;
    }
}
