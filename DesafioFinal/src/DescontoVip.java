class DescontoVIP implements RegraDesconto {
    public double calcular(Pedido pedido) {
        return pedido.getValorBruto() * 0.20; // 20% de desconto
    }
}