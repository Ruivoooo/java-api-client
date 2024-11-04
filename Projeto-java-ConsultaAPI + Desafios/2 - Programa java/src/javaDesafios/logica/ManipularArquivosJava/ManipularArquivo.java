package javaDesafios.logica.ManipularArquivosJava;

import java.io.FileWriter;
import java.io.IOException;

public class ManipularArquivo {
    public static void main(String[] args) throws IOException {

        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteudo a ser gravado no arquivo");
        escrita.close();

    }

}
