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
        String nome = nomeArquivo.replace(".txt", "");
        String[] dadosSelecao = nome.split("_");

        String pais = dadosSelecao[0];
        int ano = Integer.parseInt(dadosSelecao[1]);

        Selecao selecao = new Selecao();
        selecao.setPais(pais);
        selecao.setAno(ano);

        for (String linha : linhas) {

            String[] dadosJogador = linha.split(";");

            String nomeJogador = dadosJogador[0];
            int overall = Integer.parseInt(dadosJogador[1]);
            String posicao = dadosJogador[2];

            Jogador jogador = new Jogador(nomeJogador, overall, posicao);

            selecao.adicionarJogador(jogador);
        }

        return selecao;
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
