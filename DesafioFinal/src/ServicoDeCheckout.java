class ServicoDeCheckout {
    private Repositorio<Pedido, String> repositorio;
    private MetodoPagamento metodoPagamento;
    private Notificador notificador;

    public ServicoDeCheckout(Repositorio<Pedido, String> repositorio, MetodoPagamento metodoPagamento, Notificador notificador) {
        this.repositorio = repositorio;
        this.metodoPagamento = metodoPagamento;
        this.notificador = notificador;
    }

    public ReciboPagamento finalizarPedido(Pedido pedido) {
        repositorio.salvar(pedido);
        ReciboPagamento recibo = metodoPagamento.pagar(pedido.getId(), pedido.getTotal());
        if (recibo.isSucesso()) {
            notificador.notificar(pedido.getCliente(),
                    "Pedido " + pedido.getId() + " pago com sucesso via " + recibo.getMetodo() +
                            ". Valor total: R$ " + String.format("%.2f", pedido.getTotal()));
        } else {
            notificador.notificar(pedido.getCliente(),
                    "Falha no pagamento do pedido " + pedido.getId() + ": " + recibo.getMensagem());
        }
        return recibo;
    }
}
