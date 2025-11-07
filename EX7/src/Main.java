interface Trabalhavel {
    void trabalhar();
}

interface Dirigivel {
    void dirigir();
}

interface Programavel {
    void programar();
}

class Desenvolvedor implements Trabalhavel, Programavel {
    public void trabalhar() { System.out.println("Trabalhando..."); }
    public void programar() { System.out.println("Programando..."); }
}

class Motorista implements Trabalhavel, Dirigivel {
    public void trabalhar() { System.out.println("Trabalhando..."); }
    public void dirigir()   { System.out.println("Dirigindo..."); }
}

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor();
        dev.trabalhar();
        dev.programar();

        Motorista mot = new Motorista();
        mot.trabalhar();
        mot.dirigir();
    }
}
