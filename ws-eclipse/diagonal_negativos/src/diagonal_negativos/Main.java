package diagonal_negativos;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N, i, j, negativo = 0;

		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();

		int mat[][] = new int[N][N];

		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					negativo = negativo + 1;
				}
			}
		}
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (i = 0; i < N; i++) {
			System.out.printf("%d ", mat[i][i]);
		}
		System.out.printf("\nQuantidade de negativos = %d", negativo);

		sc.close();
	}

}
