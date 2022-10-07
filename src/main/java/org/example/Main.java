package org.example;

public class Main {
    public static void main(String[] args) {
        double nums []={1.1, -1.2, 1.5, 2.6, 4.2, 6.2, 6.7 , 8.1, 8.4, 2.5, 1.9, 5.2, 7.4, 4.1, 7.5, 4.7};
        String n = "";
        double Summa = 0;
        int positiveNumbers = 0;
        boolean negative = false;
        for (double element : nums) {
            if (element < 0) {
                negative = true;
            } else if (element > 0 && negative) {
                System.out.println(n);
                if (element > 0){
                    Summa=Summa+element;positiveNumbers++;
                }


            }} System.out.println("Положительных чисел = " + positiveNumbers);
        System.out.println("Сумма = " + Summa);
        System.out.println("Среднее арифметичекое полож. чисел = " + Summa / positiveNumbers);
    }}