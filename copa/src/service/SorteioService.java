package service;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import model.Jogador;
import model.Selecao;

public class SorteioService {
    private ArrayList<Selecao> selecoes = new ArrayList<>();
    
    public SorteioService(){
        carregarSelecoes();
    }
    
    /**
     * Percorre os arquivos para montar as selecoes
     * @return 
     */
    private void carregarSelecoes() {        
        File pastaSelecoes = new File("src/assets/selecoes");
        File[] pastas = pastaSelecoes.listFiles();

        for(File pastaPais : pastas) {
            File[] arquivos = pastaPais.listFiles();

            for(File arquivo : arquivos) {
                ManipulaArquivoTexto leitor = new ManipulaArquivoTexto(arquivo.getPath());
                leitor.abrirArquivoLeitura();
                
                ArrayList<String> linhas = leitor.lerArquivo();
                leitor.fecharArquivoLeitura();
                
                Selecao selecao = criarSelecao(arquivo.getName(), linhas);
                selecoes.add(selecao);
            }
        }
        
    }
    
    /**
     * Cria os jogadores da selecao de cada arquivo
     * @param nomeArquivo
     * @param linhas
     * @return 
     */
    private Selecao criarSelecao(String nomeArquivo, ArrayList<String> linhas) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        
        for(String linha : linhas) {
            String[] dados = linha.split(";");
            
            String nome = dados[0];
            int ataque = Integer.parseInt(dados[1]);
            int defesa = Integer.parseInt(dados[2]);
            String posicao = dados[3];
            
            jogadores.add(new Jogador(nome, ataque, defesa, posicao));
        }
        String nome = nomeArquivo.replace(".txt", "");
        String[] dados = nome.split("_");
        String pais = dados[0];
        int ano = Integer.parseInt(dados[1]);
        return new Selecao(pais, ano, jogadores);
    }
    
    /**
     * Sorteia uma selecao aleatoria dentre as pre carregadas
     * @return 
     */
    public Selecao sortearSelecao() {
        Random random = new Random();
        int indice = random.nextInt(selecoes.size());
        return selecoes.get(indice);
    }
}
