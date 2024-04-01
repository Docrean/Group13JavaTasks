package Brandon.Wk2;


import java.util.Queue;

public class NumbersDivisibleBy_3_5_15 {

    public static void main(String[] args) {

        String result3, result5, result15;
        result3 = "Divisible by 3";
        result5 = "Divisible by 5";
        result15 = "Divisible by 15";

        for (int i = 1; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
               result15 += " " + i;
           } else if (i % 3 == 0 && i % 15!= 0){
                result3 += " " + i;
           } else if (i % 5 == 0 && i % 15!= 0){
                result5 += " " + i;
           }

        }

        System.out.println(result15);
        System.out.println(result5);
        System.out.println(result3);
    }
}





/*
    NumbersDivisibleBy 3, 5, 15
    Write a program that can print numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        if the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibleBy15 section
        if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section
        if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section

        Output:
        Divisible By 15 15 30 45 60 75 90
        Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
        Divisible By 3 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99
 */