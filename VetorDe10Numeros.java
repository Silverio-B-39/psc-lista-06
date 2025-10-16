package Exe2;

import java.util.Scanner;

public class VetorDe10Numeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[] numeros = new double[10];
		int tamanho = numeros.length;

		System.out.println("Digite " + tamanho + " números reais:");

		for (int i = 0; i < tamanho; i++) {
			System.out.print("Número na posição " + i + ": ");

			numeros[i] = scanner.nextDouble();
		}

		System.out.println("\nOs números que você digitou, na ordem inversa, são:");

		for (int i = tamanho - 1; i >= 0; i--) {
			System.out.println("Posição " + i + ": " + numeros[i]);
		}

		scanner.close();
	}
}