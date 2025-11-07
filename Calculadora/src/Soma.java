public class Soma implements OperacaoStrategy {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}