package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();

		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();

		double area = base * altura;
		System.out.printf("area = %.4f\n", area);

		double perimetro = (altura * 2) + (base * 2);
		System.out.printf("Perimetro = %.4f\n", perimetro);

		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.printf("Diagonal = %.4f\n", diagonal);

		sc.close();
	}
}