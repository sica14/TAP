import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente("C001", "Gabriel Sica", "VIP");
        Produto monitor = new Produto("P100", "Monitor 27\"", 1200.00);
        Produto teclado = new Produto("P200", "Teclado Mecânico", 350.00);

        Pedido pedido = new Pedido("PED001", gabriel);
        pedido.adicionarItem(new ItemPedido(monitor, 1));
        pedido.adicionarItem(new ItemPedido(teclado, 2));

        Map<String, Double> cupons = new HashMap<>();
        cupons.put("PROMO10", 0.10);
        RegraDesconto desconto = new DescontoCupom("PROMO10", cupons);

        ServicoDePreco servicoPreco = new ServicoDePreco(desconto);
        servicoPreco.calcularTotal(pedido);

        MetodoPagamento pagamento = new PagamentoPix();

        Repositorio<Pedido, String> repositorio = new RepositorioMemoria();
        Notificador notificador = new NotificadorConsole();

        ServicoDeCheckout checkout = new ServicoDeCheckout(repositorio, pagamento, notificador);
        ReciboPagamento recibo = checkout.finalizarPedido(pedido);

        System.out.println("\n==== RESUMO DO PEDIDO ====");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + " x" + item.getQuantidade() +
                    " = R$ " + String.format("%.2f", item.getSubtotal()));
        }
        System.out.println("Subtotal: R$ " + String.format("%.2f", pedido.getValorBruto()));
        System.out.println("Desconto: R$ " + String.format("%.2f", pedido.getDesconto()));
        System.out.println("Total:    R$ " + String.format("%.2f", pedido.getTotal()));
        System.out.println("Pagamento: " + recibo.getMetodo());
        System.out.println("Transação: " + recibo.getTransacao());
    }
}