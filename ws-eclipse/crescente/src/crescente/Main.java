package crescente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores:");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		if (valor1 > valor2) {
			System.out.println("DESCRESENTE");
		} else {
			System.out.println("CRESCENTE");
		}
		while (valor1 != valor2) {
			System.out.println("Digite outros dois valores:");
			valor1 = sc.nextInt();
			valor2 = sc.nextInt();
			if (valor1 > valor2) {
				System.out.println("DESCRESENTE");
			} else if (valor2 > valor1) {
				System.out.println("CRESCENTE");
			} else {
				System.out.println();
			}
		}
		sc.close();
	}
}