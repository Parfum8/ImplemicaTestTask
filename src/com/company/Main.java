package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите N: ");
        n = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

        System.out.print(Catalan(n));
    }

    public static int Catalan(int n) {


        int[] C = new int[n + 1];
        C[0] = 1;
        for (int i = 1; i <= n; i++) {
            C[i] = 0;
            for (int j = 0; j < i; j++)
                C[i] += C[j] * C[i - 1 - j];
        }

        return C[n];
    }


}