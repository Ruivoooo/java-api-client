package javaDesafios.Desafios.Java;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void fichaTecnica(){
        titulo = "Leans PT 2";
        artista = "Yunk vino";
        anoLancamento = 2021;
    }

    void avalia(int nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    int pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
