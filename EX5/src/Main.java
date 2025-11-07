class Ave {
    public void emitirSom() {
        System.out.println("Piu!");
    }
}

interface Voadora {
    void voar();
}

class Andorinha extends Ave implements Voadora {
    public void voar() { System.out.println("Andorinha voando..."); }
}

class Pinguim extends Ave { }

public class Main {
    public static void main(String[] args) {
        Ave ave1 = new Andorinha();
        Ave ave2 = new Pinguim();

        ave1.emitirSom();
        ave2.emitirSom();

        Voadora voadora = new Andorinha();
        voadora.voar();
    }
}
