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
    public static void moveLeft(int[] array, int positions) {
        int size = array.length;
        for (int i = size; i > positions; i--) {
            int temp = array[size-1];
            for (int j = size-1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
    }
 public static  String xor(String str1, String str2){
int a = 0;
     if (str1.length() > str2.length()) {
         a=str1.length();
     }
     if (str1.length() < str2.length()) {
         a=str2.length();
     }

        char s1[] = str1.toCharArray();
        char s2[] = new char[a];
     for (int i = 0; i < str2.length(); i++) {

         s2[i] = str2.charAt(i);



     }
        int res[] = new int[a] ;
        for (int i = 0; i < str1.length(); i++) {
         res[i]= s1[i]^s2[i] ;
        }
        //String resylt;
       // resylt = new String();
        char resylt[] = new char[a];
     for (int i = 0; i < res.length; i++) {
        if (res[i]>32){
         resylt[i] = (char)res [i];

     }else resylt[i]= ' ';
     }


     return Arrays.toString(resylt);
    }


    public static void main(String[] args) {
        /*int amount ;
        int [] massive ;
        System.out.println("Введите количество чисел");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        massive = new int[amount];
        System.out.println("Введите массив");
        for (int i = 0; i < amount ; i++) {
            massive[i] = sc.nextInt();
        }

        countNum(massive,amount);*/
       /* int a[]= {0,1,2,3};
        moveLeft(a,4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i]+" ");
        }*/
        System.out.println(xor("abcrg","def"));
    }
}
