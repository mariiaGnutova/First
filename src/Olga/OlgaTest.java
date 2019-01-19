package Olga;

import java.util.Scanner;

public class OlgaTest {
    public static void main(String[] args) {
        System.out.println(" Please give your age");
        Scanner test = new Scanner(System.in);
        int age = test.nextInt();
        boolean istPositiv = age > 0;
        if (istPositiv){
            System.out.println("istPositiv " + istPositiv);
        }

        boolean istNegativ = age < 0;
        if (istNegativ){
            System.out.println("istNegativ " + istNegativ);
        }
        boolean istNull = age == 0;
        if (istNull){
            System.out.println("istNull " + istNull);
        }
        boolean istGerade = ((age %2) == 0);
        if (istGerade){
            System.out.println("istGerade " + istGerade);
        }

    }
}
