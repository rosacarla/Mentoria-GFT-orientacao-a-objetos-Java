package dio.com.java;

/*
Crie uma classe que modele um retângulo.
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: mudar valor dos lados, retornar valor dos lados, calcular área e perímetro.
*/

public class Rectangle {
    //attributes
    private double sideA;
    private double sideB;

    //methods
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea(){
        return this.sideA * this.sideB;
    }

    public double calculatePerimeter(){
        return 2 * (this.sideA + this.sideB);
    }

    public double getSideA() {
        return sideA;
    }
}