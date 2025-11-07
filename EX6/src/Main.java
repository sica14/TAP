class Veiculo {
    public void mover() {
        System.out.println("Movendo veículo...");
    }
}

interface Motorizado {
    void acelerar();
}

class Carro extends Veiculo implements Motorizado {
    public void acelerar() {
        System.out.println("Acelerando motor...");
    }
}

class Bicicleta extends Veiculo {
    public void pedalar() {
        System.out.println("Pedalando...");
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bike = new Bicicleta();

        carro.mover();
        bike.mover();

        Motorizado motorizado = new Carro();
        motorizado.acelerar();

        ((Bicicleta) bike).pedalar();
    }
}
