package ru.mirea.task1.opt7;

public class Factorial {

    public static int factorial(int a) {
        int fact = 1;
        for (int i = 0; i < a; i++) {
            fact *= i+1;
        }
        return fact;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
    }
}
