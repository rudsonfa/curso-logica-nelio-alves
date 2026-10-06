package soma_impares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int troca = 0;
		int soma = 0;

		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		}
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println("SOMA DOS IMPARES = " + soma);

		sc.close();
	}

}
