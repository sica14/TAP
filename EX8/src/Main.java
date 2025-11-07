interface Voa {
    void voar();
}

interface Nada {
    void nadar();
}

interface Anda {
    void andar();
}

class Cachorro implements Nada, Anda {
    public void nadar() { System.out.println("Nadando..."); }
    public void andar() { System.out.println("Andando..."); }
}

class Pato implements Voa, Nada, Anda {
    public void voar()  { System.out.println("Voando..."); }
    public void nadar() { System.out.println("Nadando..."); }
    public void andar() { System.out.println("Andando..."); }
}

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.andar();
        dog.nadar();

        Pato pato = new Pato();
        pato.andar();
        pato.nadar();
        pato.voar();
    }
}
