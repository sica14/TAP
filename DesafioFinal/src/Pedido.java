import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Pedido {
    private String id;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private double desconto;
    private double total;

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItens() { return Collections.unmodifiableList(itens); }

    public void adicionarItem(ItemPedido item) { itens.add(item); }

    public double getValorBruto() {
        double soma = 0;
        for (ItemPedido item : itens) soma += item.getSubtotal();
        return soma;
    }

    public void setDesconto(double desconto) { this.desconto = desconto; }
    public double getDesconto() { return desconto; }

    public void setTotal(double total) { this.total = total; }
    public double getTotal() { return total; }
}