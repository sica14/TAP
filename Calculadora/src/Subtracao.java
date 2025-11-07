public class Subtracao implements OperacaoStrategy {
    @Override
    public double executar(double a, double b) {
        return a - b;
    }
}