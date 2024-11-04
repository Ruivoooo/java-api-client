package javaDesafios.logica.java;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int areaDeUmRetangulo;
    private int total;

    @Override
    public void calcularArea(int altura , int largura) {
        total = (altura + largura) * 2;
        System.out.println("A area do retangulo é de " + total);
    }
    @Override
    public void calcularPerimetro(int altura , int largura) {
        total = altura + largura * 2;

    }



}
