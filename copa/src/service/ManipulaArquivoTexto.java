package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ManipulaArquivoTexto {
    private String nomeArquivo;
    private Formatter gravador;
    private Scanner leitor;
    
    public ManipulaArquivoTexto(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }
    
    public void abrirArquivoGravacao() throws FileNotFoundException{
        this.gravador = new Formatter(nomeArquivo);
    }
    
    public void gravarNoArquivo(ArrayList<String> linhas){
        if(gravador != null) {
            for(String linha: linhas){
                gravador.format("%s\n", linha);
            }
            gravador.flush();
        }
    }
    
    public void fecharArquivo(){
        if(gravador != null) {
            gravador.close();
        }
    }
    
    public void abrirArquivoLeitura(){
        try {
            leitor = new Scanner(new File(nomeArquivo));
        } catch (FileNotFoundException ex) {
            System.err.println("o arquivo nao pode ser aberto para leitura");
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> lerArquivo() {
        ArrayList<String> retorno = new ArrayList<>();

        if(leitor != null) {
            while(leitor.hasNext()) {
                retorno.add(leitor.nextLine());
            }
        }
        return retorno;
    }
    
    public void fecharArquivoLeitura(){
        if(leitor != null) {
            leitor.close();
        }
    }
}
