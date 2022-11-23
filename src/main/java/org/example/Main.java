package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;


/**
 * Написать метод, который получает на вход запрос с двумя полями (строкой и числом)
 * и возвращает отформатированную строку с переданными данными. Реализовать через лямбда ф-цию.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Age: ");
        Integer age=sc.nextInt();

        BiFunction<String, Integer, String > bf=(String someName, Integer someAge )-> "Name:"+someName+" Age:"+ someAge;
        System.out.println(bf.apply(name, age));
    }
}