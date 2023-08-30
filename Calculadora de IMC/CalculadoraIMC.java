import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Definindo o uso do ponto como separador decimal

        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        while (peso < 0) {
            System.out.println("Peso não pode ser negativo. Digite novamente: ");
            peso = scanner.nextDouble();
        }

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        while (altura < 0) {
            System.out.println("Altura não pode ser negativa. Digite novamente: ");
            altura = scanner.nextDouble();
        }

        double imc = peso / (altura * altura);

        String status;

        if (imc < 18.5) {
            status = "Abaixo do Peso";
        } else if (imc >= 18.5 && imc <= 25) {
            status = "Normal";
        } else {
            status = "Acima do Peso";
        }

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
