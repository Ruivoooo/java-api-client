package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("Está entre os favoritos");
        } else if(classificavel.getClassificacao() >=2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Assista depois");
        }
    }
}
