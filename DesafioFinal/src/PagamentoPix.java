class PagamentoPix implements MetodoPagamento {
    public ReciboPagamento pagar(String idPedido, double valor) {
        String tx = "PIX-" + System.currentTimeMillis();
        return new ReciboPagamento(idPedido, "PIX", tx, true, "Pagamento via PIX confirmado");
    }
}