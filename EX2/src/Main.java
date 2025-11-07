class GeradorRelatorioVendas {
    public String gerar() {
        System.out.println("Gerando relatório de vendas...");
        return "RELATORIO_VENDAS";
    }
}

interface RelatorioStorage {
    void salvar(String conteudo);
}

class ArquivoTxtStorage implements RelatorioStorage {
    public void salvar(String conteudo) {
        System.out.println("Relatório salvo em arquivo .txt");
    }
}

public class Main {
    public static void main(String[] args) {
        GeradorRelatorioVendas gerador = new GeradorRelatorioVendas();
        ArquivoTxtStorage storage = new ArquivoTxtStorage();

        String relatorio = gerador.gerar();
        storage.salvar(relatorio);
    }
}
