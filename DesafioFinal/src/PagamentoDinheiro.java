class PagamentoDinheiro implements MetodoPagamento {
    public ReciboPagamento pagar(String idPedido, double valor) {
        return new ReciboPagamento(idPedido, "Dinheiro", "N/A", true, "Pagamento recebido em dinheiro");
    }
}