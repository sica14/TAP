interface Persistencia {
    void salvar(String dados);
}

class BancoDeDados implements Persistencia {
    public void salvar(String dados) {
        System.out.println("Salvando no banco: " + dados);
    }
}

class RelatorioService {
    private Persistencia persistencia;

    public RelatorioService(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public void gerarRelatorio() {
        persistencia.salvar("Relatório de vendas");
    }
}

public class Main {
    public static void main(String[] args) {
        Persistencia banco = new BancoDeDados();
        RelatorioService service = new RelatorioService(banco);
        service.gerarRelatorio();
    }
}
