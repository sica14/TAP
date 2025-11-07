import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> calculadora.setOperacao(new Soma());
            case 2 -> calculadora.setOperacao(new Subtracao());
            case 3 -> calculadora.setOperacao(new Multiplicacao());
            case 4 -> calculadora.setOperacao(new Divisao());
            default -> {
                System.out.println("Opção inválida!");
                sc.close();
                return;
            }
        }

        double resultado = calculadora.calcular(a, b);
        System.out.println("\nResultado: " + resultado);
        sc.close();
    }
}
