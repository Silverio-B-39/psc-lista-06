package Exe6;

import java.util.Scanner;

public class QuatroNotasDe10Alunos {

	public static void main(String[] args) {

		int NUMERO_ALUNOS = 10;
		int NUMERO_NOTAS = 4;

		double[] mediasAlunos = new double[NUMERO_ALUNOS];

		Scanner scanner = new Scanner(System.in);

		int alunosAprovados = 0;

		for (int i = 0; i < NUMERO_ALUNOS; i++) {
			double somaNotas = 0;

			System.out.println("\nAluno " + (i + 1) + " ");

			for (int j = 0; j < NUMERO_NOTAS; j++) {
				System.out.print("Digite a " + (j + 1) + "ª nota: ");

				while (!scanner.hasNextDouble()) {
					System.out.println("Entrada inválida. Digite um número para a nota.");
					scanner.next();
					System.out.print("Digite a " + (j + 1) + "ª nota: ");
				}
				double nota = scanner.nextDouble();
				somaNotas += nota;
			}

			double media = somaNotas / NUMERO_NOTAS;

			mediasAlunos[i] = media;

			System.out.printf("Média calculada: %.2f\n", media);

			if (media >= 7.0) {
				alunosAprovados++;
			}
		}

		scanner.close();

		System.out.println("MÉDIAS FINAIS ARMAZENADAS NO VETOR:");
		for (int i = 0; i < mediasAlunos.length; i++) {
			System.out.printf("Aluno %d: %.2f\n", (i + 1), mediasAlunos[i]);
		}

		System.out.println("RESULTADO FINAL DO EXERCÍCIO");
		System.out.println("Total de alunos com média >= 7.0: " + alunosAprovados);

	}
}