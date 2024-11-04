package javaDesafios.logica.DesafiosJsonGson;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", 20, "Formiga");


//Serializando o objeto(classe pessoa) para JSON , ou seja transformando o JSON em string
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        System.out.println(pessoa);

        pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("O nome dele é: " + pessoa.nome());




    }

}
