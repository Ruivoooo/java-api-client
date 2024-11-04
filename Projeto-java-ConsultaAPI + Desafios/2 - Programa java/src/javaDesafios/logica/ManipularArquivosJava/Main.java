package javaDesafios.logica.ManipularArquivosJava;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Titulo titulo = new Titulo("Batman", 2022, 120);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(titulo);

        gson.toJson(titulo);
        System.out.println(titulo);

        FileWriter escrita = new FileWriter("arquivo.json");
        escrita.write(gson.toJson(titulo));
        escrita.close();



    }

    private static void setPrettyPrinting() {
    }
}
