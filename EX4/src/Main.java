interface Forma {
    double area();
}

class Circulo implements Forma {
    private double raio;
    public Circulo(double raio) { this.raio = raio; }
    public double area() { return Math.PI * raio * raio; }
}

class Retangulo implements Forma {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double area() { return largura * altura; }
}

class CalculadoraArea {
    public double calcularArea(Forma forma) {
        return forma.area();
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        System.out.println("Círculo: " + calc.calcularArea(new Circulo(5)));
        System.out.println("Retângulo: " + calc.calcularArea(new Retangulo(4, 6)));
    }
}
