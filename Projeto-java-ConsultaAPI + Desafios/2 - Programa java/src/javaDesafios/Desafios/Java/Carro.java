package javaDesafios.Desafios.Java;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int idadeCarro = 2020;
    int media;




    void fichaTecnica(){
        modelo = "Fiesta";
        ano = 2005;
        cor = "Preto";
    }
    int idade (int ano){
        media = idadeCarro - ano;
        return media;


    }

}
