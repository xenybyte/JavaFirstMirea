package ru.mirea.task1.opt3;
import java.util.ArrayList;
import java.util.Scanner;


public class ArraySum {
    public static void main(String[] args) throws Exception {
        int summ = 0;
        int nInput = 0;
        int nCount = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        if (sc.hasNextInt()) {
            nCount = sc.nextInt();
        }
        ArrayList<Integer> numberArray = new ArrayList<>();

        //writing to array
        for (int i = 0; i < nCount; i++) {
            if (sc.hasNextInt()) {
                nInput = sc.nextInt();
                numberArray.add(nInput);
            }
        }
        // for
        System.out.print("Сумма через цикл for: ");
        for (int i = 0; i < nCount; i++) {
            summ += numberArray.get(i);
        }
        System.out.println(summ);
        float avg = (summ / nCount);
        System.out.println("Среднее арифметическое: " + summ / (float)nCount);
    }
}
