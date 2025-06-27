package miprimerprograma;

public class MagicCalculator {
    enum Operation {
        SUM,SUBST,MULT,DIV,POW,EXP,FACT;
    }
    static final int PREC = 33;

    public double calc(Operation op, double[] operands ) {
        double result = 0;
        switch(op) {
            case SUM:
                if (operands.length == 2) {
                    result = add(operands[0],operands[1]);
                }
                break;

            case SUBST:
                SUM:
                if (operands.length == 2) {
                    result = subt(operands[0],operands[1]);
                }
                break;

            case MULT:
                if (operands.length == 2) {
                    result = mult(operands[0],operands[1]);
                }
                break;

            case DIV:
                if (operands.length == 2) {
                    result = div(operands[0],operands[1]);
                }
                break;

            case POW:
                if (operands.length == 2) {
                    result = power(operands[0],(int)operands[1]);
                }
                break;

            case EXP:
                if (operands.length == 1){
                    result = exp((int)operands[0]);
                }
                break;

            case FACT:
                if (operands.length == 1){
                    result = factorial((int)operands[0]);
                }
                break;
        }
        return result;
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
}
