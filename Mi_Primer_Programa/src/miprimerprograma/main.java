package miprimerprograma;


public class main {
	
	//*
	// FUNCIÓN FACTORIAL
	public static void main(String[] args) {
		int n = 11;
		System.out.print(factorial(n));
	}
	
	public static int factorial(int n) {
		return -1;
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
	
	// ALGORITMOS DE ORDENACIÓN DE ARRAYS
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
	
	// EJERCICIO PIRÁMIDE NUMÉRICA
	// */

}
