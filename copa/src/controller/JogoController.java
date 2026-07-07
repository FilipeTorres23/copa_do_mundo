package controller;
import model.Selecao;
import service.SorteioService;

public class JogoController {
    private SorteioService sorteio;
    
    /**
     * Inicializa o controlador e o serviço responsável
     * pelo carregamento das seleções.
     */
    public JogoController() {
        sorteio = new SorteioService();
    }
   
    /**
     * Sorteia uma seleção aleatória disponível no sistema.
     *
     * @return seleção sorteada
     */
    public Selecao sortearSelecao() {
        return sorteio.sortearSelecao();
    }
}
