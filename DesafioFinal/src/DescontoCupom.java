import java.util.Map;

class DescontoCupom implements RegraDesconto {
    private String codigo;
    private Map<String, Double> cupons;

    public DescontoCupom(String codigo, Map<String, Double> cupons) {
        this.codigo = codigo;
        this.cupons = cupons;
    }

    public double calcular(Pedido pedido) {
        Double valor = cupons.get(codigo);
        if (valor == null) return 0.0;
        return valor <= 1.0 ? pedido.getValorBruto() * valor : valor;
    }
}