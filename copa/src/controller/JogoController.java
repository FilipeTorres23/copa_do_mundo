package controller;
import model.Selecao;
import service.SorteioService;

public class JogoController {
    private SorteioService sorteio;
    
    public JogoController() {
        sorteio = new SorteioService();
    }
   
    /**
     * Retorna uma selecao aleatoria
     * @return 
     */
    public Selecao sortearSelecao() {
        System.out.println(sorteio.sortearSelecao());
        return sorteio.sortearSelecao();
    }
}
