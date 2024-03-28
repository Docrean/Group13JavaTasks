package Brandon.Wk1;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOperatorMethod(20,2);
    }
    //Task2

    //Write a method that can divide two numbers without using the division operator

    public static void divideWithoutDivisionOperatorMethod(int num3, int num4) {//set the method with int parameters num3 and num4
        if(num4==0) { //num4 does not equal 0 so will not run Invalid number. Compiler moves to next statement out of this method.
            System.out.println("Invalid Number");

        }

        System.out.print("When " + num3 + " is divided by " + num4 + ", the result is: " );
        //prints to console "When 20 is divided by 2, the result is: 1 and remainder is 18"

        int count =0; //set the int count to 0 to start from 0. num3 is still 20 and num4 is still 2
        while(num3 >= num4) { //while loop only runs if boolean is true(num3 >= num4 is true so we move into expression.
            num3 -= num4; //num3 decrements by 2. num4 still remains as 2
            count++; //count 1

            System.out.println(count + " and remainder is " + num3); //First pass now: "count 1 and remainder is 18
        }           //num3 decrements to >= then then exits the loop.
    }
}
