import java.util.Map;
import java.util.HashMap;

class RepositorioMemoria implements Repositorio<Pedido, String> {
    private Map<String, Pedido> banco = new HashMap<>();
    public void salvar(Pedido pedido) { banco.put(pedido.getId(), pedido); }
    public Pedido buscarPorId(String id) { return banco.get(id); }
}