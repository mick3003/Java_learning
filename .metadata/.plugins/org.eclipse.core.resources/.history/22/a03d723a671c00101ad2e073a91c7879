package miprimerprograma;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese la operación");
				String option = scanner.nextLine();
			System.out.println("Dato1");
				int num1 = scanner.nextInt();
			System.out.println("Dato2");
				double num2 = scanner.nextDouble();
		
		
		switch(option) {
		case "sumar":
			double result = add(num1,num2);
			System.out.println("El resultado es: " + result);
		break;
		
		case "restar":
			double result1 = subt(num1,num2);
			System.out.println("El resultado es: " + result1);
		break;
		
		case "multiplicar":
			double result2 = mult(num1,num2);
			System.out.println("El resultado es: " + result2);
		break;
		
		case "dividir":
			double result3 = div(num1,num2);
			System.out.println("El resultado es: " + result3);
		break;
		
		case "potencia":
			double result4 = power(num2,num1);
			System.out.println("El resultado es: " + result4);
		break;
			
		case "exponencial":
			double result5 = exp(num1);
			System.out.println("El resultado es: " + result5);
		break;
		
		case "factorial":
			double result6 = factorial(num1);
			System.out.println("El resultado es: " + result6);
		break;
		}
		/*
		static final int PREC = 33;
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
