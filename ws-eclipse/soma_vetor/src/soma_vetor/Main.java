package soma_vetor;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int i;
		double[] vet = new double[N];
		double soma = 0;
		double media = 0;

		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}

		media = soma / N;

		System.out.print("Valores = ");
		for (i = 0; i < N; i++) {
			System.out.printf("%.1f  ", vet[i]);
		}
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f", media);

		sc.close();
	}
}