package aw.some;

/**
 * Recursion
 *
 */
public class Scenario12 {
    public Integer factorialRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    public int fibonacciRecusrion(int number) {
        if (number <= 1) {
            return 1;
        }
        return fibonacciRecusrion(number - 1) + fibonacciRecusrion(number - 2);
    }
}
