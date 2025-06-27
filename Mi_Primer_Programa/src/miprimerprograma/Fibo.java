package miprimerprograma;

public class Fibo {

   private MyArray array = new MyArray();

    public MyArray createSerie(int count){
        long a = 0;
        long b = 1;


        for (int i = 0; i < count; i++){
            array.addNumber(a);
            long next = a + b;
            a = b;
            b = next;
        }
        return array;
    }
    
}
