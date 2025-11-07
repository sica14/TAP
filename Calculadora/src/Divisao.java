public class Divisao implements OperacaoStrategy {
    @Override
    public double executar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}