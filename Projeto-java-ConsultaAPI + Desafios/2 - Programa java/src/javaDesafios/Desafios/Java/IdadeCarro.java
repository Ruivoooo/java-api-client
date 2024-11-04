package javaDesafios.Desafios.Java;

public class IdadeCarro {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.fichaTecnica();
        System.out.println(car.modelo);
        System.out.println(car.ano);
        System.out.println(car.cor);

        car.idade(2005);
        System.out.println(car.media);



    }
}
