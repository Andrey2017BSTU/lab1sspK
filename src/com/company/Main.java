package com.company;


import java.io.*;
import java.util.*;

public class Main {

    public static void countNum(int[] mas, int amount) {


        //int amount = mas.length;
        int[] num;

        num = new int[amount];


        for (int i = 0; i < amount; i++) {
            num[i] = (int) Math.log10(mas[i]) + 1;
        }
        Arrays.sort(num, 0, amount);

        int elem = num[0];
        int n = 1;
        System.out.println(num[1]);

        for (int i = 1; i < amount; i++) {
            if (num[i] == elem) {
                n++;
                if (i == amount - 1) {
                    System.out.println(+elem + "-циферных элементов " + " " + n);
                }
            } else {
                System.out.println(+elem + "-циферных элементов " + " " + n);
                elem = num[i];
                n = 1;

                if (i == amount - 1) {
                    System.out.println(+elem + "-циферных элементов " + " " + n);
                }
            }
        }
    }

    public static void shifLeft(int[] array, int positions) {
        int size = array.length;
        for (int i = size; i > positions; i--) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }

    public static String xor(String str1, String str2) {
        int a = 0;
        if (str1.length() >= str2.length()) {
            a = str1.length();
        }
        if (str1.length() <= str2.length()) {
            a = str2.length();
        }

        int s1[] = new int[a];
        int s2[] = new int[a];
        for (int i = 0; i < str2.length(); i++) {
            s2[i] = str2.charAt(i);
        }
        for (int i = 0; i < str1.length(); i++) {
            s1[i] = str1.charAt(i);
        }
        int res[] = new int[a];
        for (int i = 0; i < a; i++) {
            res[i] = s1[i] ^ s2[i];
        }

        char resylt[] = new char[a];
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 32) {
                resylt[i] = (char) res[i];

            } else resylt[i] = ' ';
        }


        return Arrays.toString(resylt);
    }


    public static void main(String[] args) throws IOException {
        int menu = 0;
        System.out.println("1 - первое задание");
        System.out.println("2 - второе задание");
        System.out.println("3 - третье задание");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
        switch (menu) {
            case (1):
                int amount;
                int[] massive;
                System.out.println("Введите количество чисел");
                amount = sc.nextInt();
                massive = new int[amount];
                System.out.println("Введите массив");
                for (int i = 0; i < amount; i++) {
                    massive[i] = sc.nextInt();
                }
                countNum(massive, amount);
                break;
            case (2):
                int amount1;
                int[] a;
                int numshift = 0;
                System.out.println("Введите количество чисел");
                amount1 = sc.nextInt();
                a = new int[amount1];

                System.out.println("Введите массив");
                for (int i = 0; i < amount1; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println("Введите на сколько элементов нужно сдвинуть ");
                numshift = sc.nextInt();
                shifLeft(a, numshift);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(+a[i] + " ");
                }
                break;
            case (3):
                String str1 = new String();
                String str2 = new String();
                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                System.out.println("Введите строку 1 ");
                str1 = bufferedReader.readLine();
                System.out.println("Введите строку 2 ");
                str2 = bufferedReader.readLine();
                System.out.println(xor(str1, str2));
                break;
            default:
                System.out.println("Неправильное число ");
                break;
        }

    }
}
