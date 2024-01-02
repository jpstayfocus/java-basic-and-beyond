package com.jpstayfocus;

import java.awt.*;
import java.util.Arrays;

public class Main {
            /*
            When building method:
            - Access modifiers
            - Optional static
            - Return type
            - Name
            - Optional parameters
            - Method Body
            - Optional return value
            */

            // methods that adds 2 numbers

            private static int add(int n1, int n2) {
              int result = n1 + n2;
              return result;
            }

            private static void printBrand() { // no parameters
                 System.out.println("jpstayfocus");
            }

            private static void isAdult(int age){  // naming convention example: isAdult
                if (age >= 16){
                    System.out.println("adult :) ");
                } else{
                    System.out.println("not an adult :-(");
                }
            }

            public static void main(String[] args) {
                int result = add(10, 10);
                int result2 = add(10, 100);
                System.out.println(result);
                System.out.println(result2);
                printBrand();
                isAdult(16);
                isAdult(15);


            }

}
