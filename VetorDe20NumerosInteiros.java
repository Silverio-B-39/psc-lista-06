package Exe5;

import java.util.Scanner;

public class VetorDe20NumerosInteiros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int TAMANHO_TOTAL = 20;

		int[] vetorPrincipal = new int[TAMANHO_TOTAL];

		int[] vetorPar = new int[TAMANHO_TOTAL];
		int[] vetorImpar = new int[TAMANHO_TOTAL];

		int contPar = 0;
		int contImpar = 0;

		System.out.println("--- Leitura de 20 Números Inteiros ---");

		for (int i = 0; i < TAMANHO_TOTAL; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");

			if (scanner.hasNextInt()) {
				vetorPrincipal[i] = scanner.nextInt();
				int numero = vetorPrincipal[i];

				if (numero % 2 == 0) {
					vetorPar[contPar] = numero;
					contPar++;
				} else {
					vetorImpar[contImpar] = numero;
					contImpar++;
				}
			} else {

				System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
				scanner.next();
				i--;
			}
		}

		scanner.close();

		System.out.println("\n-------------------------------------");
		System.out.println("VETOR PRINCIPAL (20 NÚMEROS):");
		imprimirVetor(vetorPrincipal, TAMANHO_TOTAL);

		System.out.println("\n-------------------------------------");
		System.out.println("VETOR PAR (" + contPar + " elementos):");
		imprimirVetor(vetorPar, contPar);

		System.out.println("\n-------------------------------------");
		System.out.println("VETOR ÍMPAR (" + contImpar + " elementos):");
		imprimirVetor(vetorImpar, contImpar);
	}

	public static void imprimirVetor(int[] vetor, int limite) {
		System.out.print("[ ");
		for (int i = 0; i < limite; i++) {
			System.out.print(vetor[i]);

			if (i < limite - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
}