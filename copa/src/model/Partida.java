package model;

import service.SorteioService;
import java.util.Random;

public class Partida {
    private Selecao usuario;
    private Selecao adversario;
    private SorteioService sorteador = new SorteioService();

    /**
     * Cria uma nova partida entre duas seleções.
     *
     * @param usuario seleção controlada pelo jogador
     */
    public Partida(Selecao usuario) {
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
    
    /**
     * Simula a realização de uma partida.
     *
     * A vitória é definida através de uma comparação
     * probabilística entre os overalls das seleções.
     * Após definir o vencedor, um placar é gerado aleatoriamente.
     *
     * @return resultado contendo adversário, placar e vencedor da partida
     */
    public ResultadoPartida jogar () {
        Random sortearPartida = new Random();
        
        while (true) {
            
            double probabilidadeUsuario = sortearPartida.nextDouble(1.0) + 0.2;
            double probabilidadeAdversario = (sortearPartida.nextDouble(1.0) + 0.2 ) / 2.2;
        
            if (usuario.getOverrAllTotal() * probabilidadeUsuario > adversario.getOverrAllTotal() * probabilidadeAdversario) {
           
                // Aqui definimos um placar para a partida
                while (true) {
                    int golsUsuario = sortearPartida.nextInt(7);
                    int golsAdversario = sortearPartida.nextInt(7);
                    
                    if (golsUsuario > golsAdversario) {
                        String placar = golsUsuario + " x " + golsAdversario;
                        return new ResultadoPartida(adversario, placar, true);
                    } else {
                        continue;
                    }
                    
                }
            }
        
            if (usuario.getOverrAllTotal() * probabilidadeUsuario < adversario.getOverrAllTotal() * probabilidadeAdversario) {
                
                while (true) {
                    int golsUsuario = sortearPartida.nextInt(7);
                    int golsAdversario = sortearPartida.nextInt(7);
                    
                    if (golsAdversario > golsUsuario) {
                        String placar = golsUsuario + " x " + golsAdversario;
                        return new ResultadoPartida(adversario, placar, false);
                    } else {
                        continue;
                    }
                }
                
            } else {
                // Aqui e o caso de empate, voltamos ate nao dar empate
                continue;
            }
        }
    }
}
