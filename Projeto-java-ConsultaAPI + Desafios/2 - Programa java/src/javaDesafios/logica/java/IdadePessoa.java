package javaDesafios.logica.java;

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ImprimirIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }

    }
}



