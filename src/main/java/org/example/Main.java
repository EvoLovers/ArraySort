package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=1;

        boolean a = false;
        String str;
        while (a==false){
            str="Пожалуйста, введите 1 если вы хотите сгенерить массив или 2, если вы хотите выйти";
            System.out.println(str);
            x=scan.nextInt();
            if (x==1){
                doing();
            } else if (x==2) {
                a=true;
            }
        }
    }
    public static void doing(){
        Scanner scanner = new Scanner(System.in);
        String str;
        int x, y, j, l, s = 0;
        str="Пожалуйста, введите размерность массива [x][x]";
        System.out.println(str);
        x = scanner.nextInt();
        int[][] anArray;

        anArray = new int[x][x];
        Random random = new Random();
        for (y = 0; y < x; y++) {
            for (j = 0; j < x; j++) {
                anArray[y][j] = random.nextInt(50 - (-50)) + (-50);
            }
        }
        str="Пожалуйста, введите с каким числом будет сравниваться массив";
        System.out.println(str);
        l = scanner.nextInt();

        for (y = 0; y < x; y += 1) {
            for (j = 0; j < x; j += 1) {
                if (anArray[y][j] > l) {
                    if ((y + j) % 3 == 0) {
                        s = s + 1;
                        str = "y = " + y + " j = " + j;
                        System.out.println(str);
                    }
                }
            }
        }
        str = "Общее число вхождений равно " + s;
        System.out.println(str);

    }
}