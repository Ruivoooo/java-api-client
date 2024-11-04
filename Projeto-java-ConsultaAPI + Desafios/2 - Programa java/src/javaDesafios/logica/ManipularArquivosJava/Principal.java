package javaDesafios.logica.ManipularArquivosJava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        ConsultaCep consulta = new ConsultaCep();
        Endereco novoEndereco = consulta.buscaEndereco("01001000");
        consulta.buscaEndereco("01001000");




    }

}
