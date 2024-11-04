package javaDesafios.logica.java;

public class AplicarDesconto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.aplicarDesconto();
        produto.setPreco(500);
        produto.aplicarDesconto();


    }
}
