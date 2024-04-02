package Brandon.Wk2;

import java.util.ArrayList;
import java.util.List;

public class PrintConsecutiveNumbers {

    public static void printConsecutiveNumbers(int n) {
        List<String> replacements = new ArrayList<>();
        replacements.add("Codility");
        replacements.add("Test");
        replacements.add("Coders");
        replacements.add("CodilityTest");
        replacements.add("CodilityTestCoders");

        for (int i = 1; i <= n; i++) {
            boolean isDivisibleBy2 = i % 2 == 0;
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;
            boolean isDivisibleBy2And3 = isDivisibleBy2 && isDivisibleBy3;
            boolean isDivisibleByAll = isDivisibleBy2 && isDivisibleBy3 && isDivisibleBy5;

            String replacement = "";
            if (isDivisibleBy2) {
                replacement = replacements.get(0);
            } else if (isDivisibleBy3) {
                replacement = replacements.get(1);
            } else if (isDivisibleBy5) {
                replacement = replacements.get(2);
            } else if (isDivisibleBy2And3){
                replacement = replacements.get(3);
            } else if (isDivisibleByAll) {
                replacement = replacements.get(4);
            }

            System.out.println(replacement.isEmpty()? i : replacement);
        }
    }

    public static void main(String[] args) {
        printConsecutiveNumbers(24);
    }
}






/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
Any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is
divisible by more than one of the numbers: 2, 3 or 5, it should be replaced by a concatenation of the respective words
Codility, Test or Coders in this given order. For example, numbers divisible by both 2 and 4 should be replaced by
CodilityTest and numbers divisible by all three numbers: 2, 3, and 5, should be replaced by CodilityTestCoders.

Output for N = 24:

    1
    Codility
    Test
    Codility
    Coders
    CodilityTest
    7
    Codility
    Test
    CodilityCoders
    11
    CodilityTest
    13
    Codility
    TestCoders
    Codility
    17

 */