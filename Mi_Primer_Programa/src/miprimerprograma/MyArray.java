package miprimerprograma;

public class MyArray {
    long[] numbers = new long[50];
    private int count = 0;
    long max = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;

    public void addNumber(long number) {
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
