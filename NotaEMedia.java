package Exe3;

import java.util.Scanner;

public class NotaEMedia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[] notas = new double[10];
		int tamanho = notas.length;
		double soma = 0.0;

		System.out.println("Digite as " + tamanho + " notas do aluno:");

		for (int i = 0; i < tamanho; i++) {

			System.out.print("Nota " + (i + 1) + ": ");

			notas[i] = scanner.nextDouble();

			soma = soma + notas[i];
		}

		double media = soma / tamanho;

		System.out.println("\nAs notas do aluno foram:");

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}

		System.out.println("A média das notas é: " + String.format("%.2f", media));

	}
}