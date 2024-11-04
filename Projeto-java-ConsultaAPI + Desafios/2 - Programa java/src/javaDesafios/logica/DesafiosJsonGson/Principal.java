package javaDesafios.logica.DesafiosJsonGson;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String json = "{\"titulo\": PequenoPrincipe ,\"autor\":FernandoPessoa }";



        Gson gson = new Gson();
        Livro editora = gson.fromJson(json, Livro.class);
        System.out.println(editora);


    }
}
