package javaDesafios.Desafios.Java;

import javaDesafios.logica.java.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;
    private double real;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public double ConversorDolarParaReal(double dolar) {
        dolar *= 5 + real;
        System.out.println("O valor em real é " + dolar);
        return dolar;
    }

}
