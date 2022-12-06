package ru.mirea.task1.opt4;
import java.util.ArrayList;
import java.util.Scanner;


public class ArraySum {
    public static void main(String[] args) throws Exception {
        int summ = 0;
        int nInput = 0;
        int nCount = 1;
        int nMax = 0;
        int nMin = Integer.MAX_VALUE;
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

        // while
        System.out.print("Сумма через цикл while: ");
        int i = 0;
        summ = 0;
        while (i < numberArray.size()) {
            summ += numberArray.get(i);
            if (numberArray.get(i) > nMax)
                nMax = numberArray.get(i);
            if (numberArray.get(i) < nMin)
                nMin = numberArray.get(i);
            i++;
        }
        System.out.println(summ);

        // do while
        System.out.print("Сумма через цикл do while: ");
        i = 0;
        summ = 0;
        do {
            summ += numberArray.get(i);
            i++;
        } while (i < numberArray.size());
        System.out.println(summ);
        System.out.println("Максимальный элемент: " + nMax + "\nМинимальный элемент: " + nMin);
    }
}
