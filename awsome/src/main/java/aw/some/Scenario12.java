package aw.some;

import static java.lang.String.format;

/**
 * Recursion : Program related to recursion
 *
 */
public class Scenario12 {

    /**
     * Factorial using recursion
     *
     * @param number number need to refactored
     * @return output
     */
    public double factorialRecursion(double number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    /**
     * Fibonacci number
     * @param number number fibonacci
     * @return output of number
     */
    public double fibonacciRecursion(double number) {
        if (number <= 1) {
            return 1;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }


    /**
     * In Recursion X is going to gets impacted by y
     *
     * @param x
     * @param y
     * @return int
     */
    public int recursionFunction(int x, int y) {
        if (x == 0) {
            return y;
        }
        return recursionFunction(x - 1, x + y);
    }

    /**
     * Recursion Function
     *
     * @param n
     * @return
     */
    public int recursionFunctionTwo(int n) {
        if (n == 1) {
            return 0;
        }
        return 1 + recursionFunctionTwo(n / 2);
    }

    public String recursionDecimalToBinary(int n, StringBuilder stringBuilder) {
        if (n == 0)
            return stringBuilder.toString();
        stringBuilder.append(format("%d", n % 2));
        return recursionDecimalToBinary(n / 2, stringBuilder);
    }


    public void functionRecursionLoop(int n) {

        int i = 0;
        if (n > 1) {
            functionRecursionLoop(n - 1);
        }
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
    }

    /**
     *
     */
    public int powerRecursion(int a, int b) {

        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return powerRecursion(a * a, b / 2);
        }
        return powerRecursion(a * a, b / 2) * a;
    }

    public int powerRecursionSimpler(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return powerRecursion(a, b - 1) * a;
    }

    //================================ For Vs recursion ======================================================//
    public void forLoop(int number){
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public void for_loop_recursion(int number){
        for_loop_recursion(0,number);
    }

    private void for_loop_recursion(int i,int number) {
        if (!(i < number)) return;
        System.out.println(i);
        for_loop_recursion(i+1,number);
    }
}
