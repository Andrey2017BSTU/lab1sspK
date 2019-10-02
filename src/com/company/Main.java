package com.company;


import java.util.*;

public class Main {

    private static void countNum(int [] mas , int amount) {


        //int amount = mas.length;
        int [] num ;

        num = new int[amount];


        for (int i = 0; i < amount ; i++) {
            num[i] = (int)Math.log10(mas[i])+1;
        }
        Arrays.sort(num,0,amount);

        int elem = num[0];
        int n = 1;
        System.out.println(num[1]);

        for (int i = 1; i < amount; i++) {
            if (num[i] == elem) {
                n++;
                if (i == amount-1 ) {
                    System.out.println(+elem+"-циферных элементов " +" "+n);}
            }else {
                System.out.println(+elem+"-циферных элементов " +" "+n);
                elem = num[i];
                n=1;

                if (i == amount-1 ) {
                    System.out.println(+elem+"-циферных элементов " +" "+n);
                }}


        }
        }
    public static void main(String[] args) {
        int amount ;
        int [] massive ;
        System.out.println("Введите количество чисел");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        massive = new int[amount];
        System.out.println("Введите массив");
        for (int i = 0; i < amount ; i++) {
            massive[i] = sc.nextInt();
        }

        countNum(massive,amount);

    }
}
