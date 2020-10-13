package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
        Zadanie5();
        Zadanie6();
        Zadanie7();
        Zadanie8();
        Zadanie9();
        Zadanie10();
    }

    public static void Zadanie1() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Ответ на задание 1:");
        System.out.println(a%b);
    }

    public static void Zadanie2() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Ответ на задание 2:");
        System.out.println (a * b / 2);
    }

    public static void Zadanie3() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Ответ на задание 3:");
        System.out.println (a * 2 + b * 4 + c * 4);
    }

    public static void Zadanie4() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a * b > c) {
            System.out.println("Ответ на задание 4:");
            System.out.println (true);
        } else {
            System.out.println("Ответ на задание 4:");
            System.out.println (false);
        }
    }

    public static void Zadanie5() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b == c) {
            System.out.println("Ответ на задание 5:");
            System.out.println ("a+b=N");
        } else {
            if (a * b == c) {
                System.out.println("Ответ на задание 5:");
                System.out.println ("a*b=N");
            } else {
                if (a / b == c) {
                    System.out.println("Ответ на задание 5:");
                    System.out.println ("a/b=N");
                } else {
                    if (b / a == c) {
                        System.out.println("Ответ на задание 5:");
                        System.out.println ("b/a=N");
                    } else {
                        if (a * b == c) {
                            System.out.println("Ответ на задание 5:");
                            System.out.println ("a*b=N");
                        } else {
                            if (a - b == c) {
                                System.out.println("Ответ на задание 5:");
                                System.out.println ("a-b=N");
                            } else {
                                System.out.println("Ответ на задание 5:");
                                System.out.println ("None");
                            }
                        }
                    }
                }
            }
        }
    }
    public static void Zadanie6(){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println("Ответ на задание 6:");
        System.out.println (a);
    }
    public static void Zadanie7(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double sum = 0.0;
        for (int i = 0; i<=a;i++){
            sum += i;
        }
        System.out.println("Ответ на задание 7:");
        System.out.println (sum);
    }
    public static void Zadanie8(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Ответ на задание 8:");
        System.out.println (a + b -1);
        }
    public static void Zadanie9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i< n;i++) {
            arr[i] = sc.nextInt();
        }
        double sum=0;
        for(int j=0; j< n; j++){
            sum+=Math.pow(arr[j],3);
        }
            System.out.println("Ответ на задание 9:");
            System.out.println (sum);
    }
    public static void Zadanie10() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        for (int i=0;i<=b;i++){
            a+=a;
        }
        if (a%c==0) {
            System.out.println("Ответ на задание 10:");
            System.out.println (true);
        } else {
            System.out.println("Ответ на задание 10:");
            System.out.println (false);
        }
    }
}
