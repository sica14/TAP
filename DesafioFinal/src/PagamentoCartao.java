import java.util.UUID;

class PagamentoCartao implements MetodoPagamento {
    public ReciboPagamento pagar(String idPedido, double valor) {
        String tx = UUID.randomUUID().toString();
        return new ReciboPagamento(idPedido, "Cartão", tx, true, "Pagamento aprovado");
    }
}