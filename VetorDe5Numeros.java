package Exe1;

import java.util.Scanner;

public class VetorDe5Numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[5];
		int tamanho = numeros.length;

		System.out.println("Por favor, digite " + tamanho + " números:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número na posição " + i + ": ");

			numeros[i] = scanner.nextInt();
		}

		System.out.println("\nOs números que você digitou foram:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posição " + i + ": " + numeros[i]);
		}

		scanner.close();
	}
}