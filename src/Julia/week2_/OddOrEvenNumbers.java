package Julia.week2_;

public class OddOrEvenNumbers {

    public static void main(String[] args) {

        int number = 45;

        boolean isEven = number % 2 == 0;//When we divide number by 2, if the remainder is 0,
        //it means that
        // the number is EVEN number

        //    boolean isOdd = number % 2 != 0;//When we divide number by 2, if the remainder is NOT 0,
        //it means
        // that the number is ODD number

        boolean isOdd = !isEven; // If the number ia NOT EVEN, then it's ODD

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);


    }

}
