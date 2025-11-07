class ServicoDePreco {
    private RegraDesconto regraDesconto;

    public ServicoDePreco(RegraDesconto regraDesconto) {
        this.regraDesconto = regraDesconto;
    }

    public void calcularTotal(Pedido pedido) {
        double bruto = pedido.getValorBruto();
        double desconto = regraDesconto.calcular(pedido);
        if (desconto > bruto) desconto = bruto;
        pedido.setDesconto(desconto);
        pedido.setTotal(bruto - desconto);
    }
}