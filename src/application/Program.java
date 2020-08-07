package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com as medidas do triangulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		
		double areaY = y.area();
		
		System.out.printf("A área do triângulo X: %.4f%n ", areaX);
		
		System.out.printf("A área do triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é: X");
		}
		else {
			System.out.println("A maior área é: Y");
		}
		
		sc.close();
	}

}

