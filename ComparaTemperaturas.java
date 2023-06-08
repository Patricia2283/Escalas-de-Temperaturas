package br.com.java17;

import java.util.Scanner;

public class ComparaTemperaturas {

	public static void main(String[] args) {

		Scanner comparar = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double temperatura = comparar.nextDouble();

		double fahrenheit = (temperatura * 1.8) + 32;
		double kelvin = temperatura + 273.15;
		double reaumur = temperatura * 0.8;
		double rankine = temperatura * 1.8 + 32 + 459.67;

		System.out.printf("%.2f" + " graus em Fahrenheit.", fahrenheit);
		System.out.printf("%n" + "%.2f" + " graus em Kelvin.", kelvin);
		System.out.printf("%n" + "%.2f" + " graus em Réaumur.", reaumur);
		System.out.printf("%n" + "%.2f" + " graus em Rankine.", rankine); 

	}

}
