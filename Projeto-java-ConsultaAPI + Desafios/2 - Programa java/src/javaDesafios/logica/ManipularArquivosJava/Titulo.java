package javaDesafios.logica.ManipularArquivosJava;

public class Titulo {
    private String titulo;
    private int ano;
    private int duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Titulo (String titulo, int ano, int duracao){
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", duracao=" + duracao +
                '}';
    }
}
