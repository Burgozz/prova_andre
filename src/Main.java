import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à calculadora!");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scanner.nextInt();
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = Addition.somar(num1, num2);
                break;
            case 2:
                resultado = Subtraction.subtrair(num1, num2);
                break;
            case 3:
                resultado = Multiplication.multiplicar(num1, num2);
                break;
            case 4:
                resultado = Division.dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(0);
        }
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}