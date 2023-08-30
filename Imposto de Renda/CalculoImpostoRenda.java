/*
Faça um algoritmo que receba o salário de um funcionário, calcule e imprima o valor do imposto de renda a ser pago, sabendo que o imposto equivale a 5% do salário.
*/

import java.util.Scanner;

public class CalculoImpostoRenda {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();
            
            double impostoRenda = salario * 0.05; // Calcula o valor do imposto de renda
            
            System.out.println("O valor do imposto de renda a ser pago é: " + impostoRenda);
        }
    }
}
