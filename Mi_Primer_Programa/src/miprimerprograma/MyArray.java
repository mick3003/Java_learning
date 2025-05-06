package miprimerprograma;

public class MyArray {
    int[] numbers = new int[50];
    private int count = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    public void addNumber(int number) {
        numbers[count] = number;
        count ++;
        if (number > max) {
            max = number;
        }
        if (number < min) {
            min = number;
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
