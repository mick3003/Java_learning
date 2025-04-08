package miprimerprograma;

public class main {

	// ALGORITMOS DE ORDENACIÓN DE ARRAYS
	//*
	public static void main(String[] args) {
		int SIZE = 10;
		int[] array = {11,23,22,10,-24,4,69,45,30,100};
		printArray(array, 10);
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
