package miprimerprograma;

import java.util.Scanner;

public class main {

	static final int PREC = 33;
	
	public static void main(String[] args) {
		double result = 0;
		printMenu();
		
		
		int option = new Scanner(System.in).nextInt();
		double[] operands;
		switch(option) {
		case 1:
			operands = scanner(2);
			result = add(operands[0],operands[1]);
			System.out.println("El resultado es: " + result);
		break;
		
		case 2:
			operands = scanner(2);
			result = subt(operands[0],operands[1]);
			System.out.println("El resultado es: " + result);
		break;
		
		case 3:
			operands = scanner(2);
			result = mult(operands[0],operands[1]);
			System.out.println("El resultado es: " + result);
		break;
		
		case 4:
			operands = scanner(2);
			result = div(operands[0],operands[1]);
			System.out.println("El resultado es: " + result);
		break;
		
		case 5:
			operands = scanner(2);
			result = power(operands[0],(int)operands[1]);
			System.out.println("El resultado es: " + result);
		break;
			
		case 6:
			operands = scanner(1);
			result = exp((int)operands[0]);
			System.out.println("El resultado es: " + result);
		break;
		
		case 7:
			operands = scanner(1);
			result = factorial((int)operands[0]);
			System.out.println("El resultado es: " + result);
		break;
		}
		/*
		
		int n = 0;
		System.out.print("Introduce un número: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int result = factorial(n);
		if (result == -1) {
			System.out.println("No se puede calcular el factorial");
		}
		else {
			System.out.println("El factorial de " + n + " es " + result);
		}
		
		System.out.println(exp(2));
		*/
		
	}
	
	
	public static double[] scanner(int count) {
		double[] data = new double [7];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < count; i++ ) {
			System.out.print("Dato " + (i+1) + ": " );
			data[i] = scanner.nextDouble();
		}
		return data;
	}
	
	
	public static void printMenu() {
		System.out.println("Calculadora mágica");
		System.out.println("   1. Sumar");
		System.out.println("   2. Restar");
		System.out.println("   3. Multiplicar");
		System.out.println("   4. Dividir");
		System.out.println("   5. Potencia");
		System.out.println("   6. Exponencial");
		System.out.println("   7. Factorial");
		System.out.println("");
		System.out.print("Introduzca código de operación: ");
	}
	
	
	public static double div(double num1, double num2) {
		return num1 / num2;
	}
	
	
	public static double mult(double num1, double num2) {
		return num1 * num2;
	}
	
	
	public static double subt(double num1, double num2) {
		return num1 - num2;
	}
	
	
	public static double add(double a, double b) {
		return a + b;	
	}
	
	
	
	public static int factorial(int n) {
		int result = 1;
		if (n > PREC || n < 0) {
			return -1;
		}
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	
	public static double power(double base, int exp) {
		double result = 1;
		for (int c = 1; c <= exp; c+=1 ) {
			result *= base;
		}
		return result;
	}
	
	
	public static double exp(int x) {
		double result = 1;
		
		for (int c = 1; c <= PREC; c++ ) {
			double pow = power(x, c);
			int fact = factorial(c);
			result += (pow / fact);
		}
		return result;
	}
	
	// FIN FUNCIÓN FACTORIAL
	// */

	
	// ALGORITMOS DE ORDENACIÓN DE ARRAYS
	/*
	
	public static void main(String[] args) {
		int SIZE = 12;
		int[] array = {11,1023,10,-24,4,69,89,97,4,45,30,99};
		
		printArray(array, SIZE);
		
		boolean isOrdered = false;
		while (!isOrdered) {
			isOrdered = true;
			for (int i = 0; i < SIZE; i++) {
				if ( i != SIZE -1 && array[i] > array[i+1] ) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					isOrdered = false;
				}
			}
		}
		
		printArray(array, SIZE);
	}
	
	public static void printArray(int[] polla, int pollaSize) {
		for (int i = 0; i < pollaSize; i++) {
			System.out.print(polla[i]);
			if (i != pollaSize -1) {
				System.out.print(", ");
			}
			else {
				System.out.print(".");
			}
		}
		System.out.println("");
	}
	
	// FIN ALGORITMOS DE ORDENACIÓN DE ARRAYS
	// */
	
	
	// EJERCICIO PIRÁMIDE NUMÉRICA
	/*
	public static void main(String[] args) {
		int numberOfRows = 15;
		printPiramid(numberOfRows); 
	}
	
	public static void printPiramid(int numRows) {
		for (int row = 1; row <= numRows; row++) {
			int numSpaces = numRows - row + 1;
			for (int esp = 0; esp < numSpaces; esp++) {
				System.out.print("  ");
			}
			printRow(row);
		}
	}
	
	
	public static void printRow(int rowNumber) {
		 for(int i = 0; i < rowNumber; i++) {
			 System.out.print((i + rowNumber) % 10);
			 System.out.print(" ");
		 }
		 
		 for(int i = rowNumber - 1; i > 0; i--) {
			 System.out.print((i + rowNumber - 1) % 10);
			 System.out.print(" ");
		 }
		 
		 System.out.println();
	}
	
	// FIN EJERCICIO PIRÁMIDE NUMÉRICA
	// */

}
