package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMath {
    Scanner scanner = new Scanner(System.in);
    private List<Integer> numbers = new ArrayList<>();
    private List<Float> numbersFloat = new ArrayList<>();
    private int howManyNumbers;

    public void addition() {
        System.out.println("Podaj ile liczb chcesz dodać:");
        howManyNumbers = scanner.nextInt();

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Podaj liczbę");
            int a = scanner.nextInt();
            numbers.add(a);
        }

        Integer integer = numbers.stream()
                .reduce(Integer::sum)
                .get();
        System.out.print("Suma to ");
        System.out.println(integer);
        numbers.clear();
    }

    public void subtraction() {
        System.out.println("Podaj ile liczb chcesz odjąć:");
        howManyNumbers = scanner.nextInt();

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Podaj liczbę");
            int a = scanner.nextInt();
            numbers.add(a);
        }

        Integer integer = numbers.stream()
                .reduce((a1, a2) -> a1 - a2)
                .get();
        System.out.print("Różnica to ");
        System.out.println(integer);
        numbers.clear();
    }

    public void multiplication() {
        System.out.println("Podaj ile liczb chcesz pomnożyć:");
        howManyNumbers = scanner.nextInt();

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Podaj liczbę");
            int a = scanner.nextInt();
            numbers.add(a);
        }

        Integer integer = numbers.stream()
                .reduce((a1, a2) -> a1 * a2)
                .get();
        System.out.print("Iloczyn to ");
        System.out.println(integer);
        numbers.clear();
    }

    public void division() {
        System.out.println("Podaj ile liczb chcesz podzielić:");
        howManyNumbers = scanner.nextInt();

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Podaj liczbę");
            float a = scanner.nextFloat();
            numbersFloat.add(a);
        }

        Float aFloat = numbersFloat.stream()
                .reduce((a1, a2) -> a1 / a2)
                .get();
        System.out.print("Iloraz to ");
        System.out.println(aFloat);
        numbersFloat.clear();
    }

    public void sinus() {
        System.out.println("Podaj miarę kąta w radianach");
        double angle = scanner.nextDouble();
        double sin = Math.sin(angle);
        System.out.println(sin);
    }

    public void cosinus() {
        System.out.println("Podaj miarę kąta w radianach");
        double angle = scanner.nextDouble();
        double cos = Math.cos(angle);
        System.out.println(cos);
    }

    public void tangens() {
        System.out.println("Podaj miarę kąta w radianach");
        double angle = scanner.nextDouble();
        if (angle == 1) {
            System.out.println("Nie istnieje!!!");
        } else {
            double tan = Math.tan(angle);
            System.out.println(tan);
        }
    }

    public void cotanges() {
        System.out.println("Podaj miarę kąta w radianach");
        double angle = scanner.nextDouble();
        if (angle == 0) {
            System.out.println("Nie istnieje!!!");
        } else {
            double tan = Math.tan(angle);
            double cos = 1 / tan;
            System.out.println(cos);
        }
    }
}
