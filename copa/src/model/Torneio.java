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
    
    public void registrarVitoria () {
        this.vitorias += 1;
        this.resultadoAtual = true;
        this.partidasJogadas += 1;
        mudarFaseAtual();
    }
    
    
    public void registrarDerrota () {
        this.derrotas += 1;
        this.resultadoAtual = false;
        this.partidasJogadas += 1;
        mudarFaseAtual();
    }
    
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
    
    
    public boolean acabou () {
        
        if (this.partidasJogadas < 3) {
            return false;
        }
        
        // O usuario perdeu na fase de grupos
        if (this.partidasJogadas == 3 && this.vitorias < 2) {
            return true;
        }
        
        // Checamos o resultado mais recente
        return this.resultadoAtual;
    }
}
