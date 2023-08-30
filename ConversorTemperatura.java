/*
Escreva um programa que calcule a conversão de um temperatura em Fahrenheit para Celsius e vice versa
• Dica: fah – 32 / 9 * 5;
• O que acontece se definir o tipo fah ou cel como inteiro
*/

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Converter de Fahrenheit para Celsius");
            System.out.println("2. Converter de Celsius para Fahrenheit");
            
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1 ->                     {
                        System.out.print("Digite a temperatura em Fahrenheit: ");
                        double fah = scanner.nextDouble();
                        double cel = (fah - 32) * 5 / 9;
                        System.out.println("A temperatura em Celsius é: " + cel);
                    }
                case 2 ->                     {
                        System.out.print("Digite a temperatura em Celsius: ");
                        double cel = scanner.nextDouble();
                        double fah = cel * 9 / 5 + 32;
                        System.out.println("A temperatura em Fahrenheit é: " + fah);
                    }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
