public class Calculadora {
    private OperacaoStrategy operacao;

    public void setOperacao(OperacaoStrategy operacao) {
        this.operacao = operacao;
    }

    public double calcular(double a, double b) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação foi definida!");
        }
        return operacao.executar(a, b);
    }
}
