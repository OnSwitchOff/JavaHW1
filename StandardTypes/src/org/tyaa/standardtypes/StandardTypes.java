/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.standardtypes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author student
 */
public class StandardTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*byte b1 = 127;
        byte b2 = -128;
        short sh1 = 1500;
        int i = 1000000000;
        long l1 = 1000000000000000000L;
        
        float fl1 = 10.12f;
        double d1 = 10000000000.55555d;
        
        char ch1 = 'A';
        for (int j = 0; j < 26; j++) {
            //System.out.println(ch1 + j);
            System.out.println(ch1);
            ch1++;
        }
        
        boolean bool1 = true;
        
        Boolean bool2 = bool1;
        //Boolean bool3 = new Boolean();*/
        
        
        /*String s11 = "Hello";
        String s12 = "Hello";
        System.out.println(s11 == s12);*/
        
        /*String s11 = Arrays.asList("Hello").get(0);
        String s12 = "Hello";
        System.out.println(s11);
        System.out.println(s11 == s12);
        System.out.println(s11.equals(s12));*/
        
        /*int[] intArr1 = {1, 2, 6, -5, 0, 10};
        int[] intArr2 = new int[6];
        Integer[] intArr3 = new Integer[6];*/
        
        /*for (Integer i : intArr3) {
            if (i != null) {
                System.out.println(i);
            } else {System.out.println("Null");}
        }*/
        
        /*int[][] intArr4 = new int[6][4];
        int[][] intArr5 = new int[6][];*/
        
        //Integer a = 10;
        //a++;
        
        //final Integer a = 11;
        //a++;
        
        //Integer a = 11;
        
        /*Integer a = 10;
        a++;
        final Integer a2 = a + 1;
        
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        
        intList.stream().filter((t) -> {
            return t > a2;
        }).collect(Collectors.toList())
            .forEach((t) -> {
                System.out.println(t);
            });*/
        /*System.out.println(">");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        System.out.println(inputString);*/
        
        //scanner.close();
        
        /*System.out.println(">");
        Scanner scanner2 = new Scanner(System.in);
        String inputString2 = scanner2.next();
        System.out.println(inputString2);*/
        
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasia", 20));
        persons.add(new Person("John", 30));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Petia", 35));
        System.out.println("Исходный массив:");
        persons.forEach((t) -> {
            System.out.println("\t"+t.toString());
        });
        boolean toHigher=false;
        UniversalSort.sort(persons, toHigher,(Object o1, Object o2) -> ((Person)o1).name.compareTo(((Person)o2).name)>0);
        System.out.println();
        System.out.println("Отсортированный(по алфавиту) массив:");
        
        persons.forEach((t) -> {
            System.out.println("\t"+t.toString());
        });
        
        //TODO: 1. переопределить метод toString у класса Person,
        //чтобы возвращались значения обоих полей одной строкой;
        //2. выполнить сортировку по имени
        
    }
    
    /**
     * foo-method
     */
    public void foo(){}
}
