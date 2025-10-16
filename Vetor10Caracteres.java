package Exe4;

import java.util.Scanner;

public class Vetor10Caracteres {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int TAMANHO_LEITURA = 10;
		int contadorConsoantes = 0;

		String consoantesLidas = "";

		System.out.println("Por favor, digite " + TAMANHO_LEITURA + " letras, uma de cada vez:");

		for (int i = 0; i < TAMANHO_LEITURA; i++) {
			System.out.print("Digite a letra número " + (i + 1) + ": ");

			String entrada = scanner.next();

			if (entrada.length() > 0) {

				char caractereAtual = entrada.toLowerCase().charAt(0);

				if (Character.isLetter(caractereAtual)) {

					if (caractereAtual != 'a' && caractereAtual != 'e' && caractereAtual != 'i' && caractereAtual != 'o'
							&& caractereAtual != 'u') {

						contadorConsoantes++;

						consoantesLidas = consoantesLidas + caractereAtual + " ";
					}
				} else {

					System.out.println("Digite APENAS letras.");
					i--;
				}
			} else {

				System.out.println("Entrada vazia. Tente novamente.");
				i--;
			}
		}

		System.out.println("Total de consoantes lidas: " + contadorConsoantes);

		if (contadorConsoantes > 0) {

			System.out.println("As consoantes foram: " + consoantesLidas.trim().toUpperCase());
		} else {
			System.out.println("Nenhuma consoante foi encontrada.");
		}

		scanner.close();
	}
}