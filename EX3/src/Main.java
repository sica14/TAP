interface RegraDesconto {
    double aplicar(double valor);
}

class DescontoVip implements RegraDesconto {
    public double aplicar(double valor) { return valor * 0.8; }
}

class DescontoRegular implements RegraDesconto {
    public double aplicar(double valor) { return valor * 0.9; }
}

class SemDesconto implements RegraDesconto {
    public double aplicar(double valor) { return valor; }
}

class CalculadoraDesconto {
    public double calcular(RegraDesconto regra, double valor) {
        return regra.aplicar(valor);
    }
}

public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calc = new CalculadoraDesconto();
        System.out.println("VIP: " + calc.calcular(new DescontoVip(), 100));
        System.out.println("REGULAR: " + calc.calcular(new DescontoRegular(), 100));
        System.out.println("SEM DESCONTO: " + calc.calcular(new SemDesconto(), 100));
    }
}
