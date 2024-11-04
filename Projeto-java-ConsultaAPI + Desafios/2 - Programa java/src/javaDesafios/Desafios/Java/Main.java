package javaDesafios.Desafios.Java;

public class Main {
    public static void main(String[] args) {
        Musica music = new Musica();

        music.fichaTecnica();
        System.out.println(music.titulo);
        System.out.println(music.artista);
        System.out.println(music.anoLancamento);

        music.avalia(5);
        music.avalia(5);
        music.avalia(5);
        System.out.println(music.somaDasAvaliacoes);
        System.out.println(music.totalDeAvaliacoes);
        System.out.println(music.pegaMedia());





    }
}
