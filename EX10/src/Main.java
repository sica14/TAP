interface LeitorDados {
    String ler();
}

class LeitorArquivo implements LeitorDados {
    public String ler() {
        return "Lendo dados do arquivo...";
    }
}

class LeitorApi implements LeitorDados {
    public String ler() {
        return "Buscando dados de uma API...";
    }
}

class Processador {
    private LeitorDados leitor;

    public Processador(LeitorDados leitor) {
        this.leitor = leitor;
    }

    public void processar() {
        System.out.println(leitor.ler());
    }
}

public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador(new LeitorArquivo());
        p1.processar();

        Processador p2 = new Processador(new LeitorApi());
        p2.processar();
    }
}
