package Exe7;

import java.util.Scanner;

public class VetorDe5NumerosInteiros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[5];

		int soma = 0;
		int multiplicacao = 1;

		System.out.println("Digite 5 números inteiros:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");

			numeros[i] = scanner.nextInt();

			soma = soma + numeros[i];

			multiplicacao = multiplicacao * numeros[i];
		}

		scanner.close();

		System.out.println("Soma: " + soma);

		System.out.println("Multiplicação: " + multiplicacao);

		System.out.print("Números: ");

		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}
}
