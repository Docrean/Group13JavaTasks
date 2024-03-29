package Brandon.Wk1;

public class FINRA {
    //1. First create the methods of the class for each FINRA method sequence. Put them within the main method so that
    //they are called when the program is run within the class.

    public static void main(String[] args) {
        FINRA_1();
        FINRA_2();
        FINRA_3();
    }

    //1. Write a method which prints out the numbers from 1 to 30 but for numbers which
    //are a multiple of 3 print "FIN" instead of the number.

    public static void FINRA_1() {
        String result = "";
        for(int i=1; i <= 30; i++) {
            if(i % 5==0 && i %3 ==0)
                result += "FINRA ";
            else if(i%5 == 0)
                result += "RA ";
            else if(i%3==0)
                result+="FIN ";
            else
                result += i+" ";
        }
        System.out.println(result);


    }
            /*
            The selected code is a method in the FINRA class in the Java program. The method is named FINRA_1 and it
            prints out the numbers from 1 to 30 but replaces certain numbers with specific strings based on whether
            they are a multiple of 3, 5, or both 3 and 5. The code uses a for loop to iterate through each number from
             1 to 30. Inside the for loop, the code checks if the current number is a multiple of 3, 5, or both 3 and 5.
              If it is, it adds the appropriate string to the result variable. Otherwise, it adds the current number as
              a string to the result variable. After the for loop is completed, the result variable is printed to the console.

              The FINRA_1 method is used to generate the Fibonacci sequence. It does this by using a for loop that
              iterates from 1 to 30. Within the loop, it checks if the current number is divisible by 5 and 3. If it is,
               it adds the string "FINRA" to the result variable. If the number is only divisible by 5, it adds "RA"
               to the result variable. If the number is only divisible by 3, it adds "FIN" to the result variable.
               If the number is not divisible by 5 or 3, it adds the current number as a string to the result variable.

                After the for loop is completed, the result variable is printed to the console.
             */

    public static void FINRA_2(){
        for (int i = 1; i < 30; i++) {
            String result = "";
            result += (i % 5 == 0 && i % 3 ==0) ? "FINRA" : (i % 5 == 0) ? "RA "
                    :(i % 3 == 0) ? "FIN" : i + " ";
            System.out.println(result);

            //This is the same code as before. This code set utilizes ternary structure to check the same conditions and
            //returns the result.
        }
    }


    public static void FINRA_3(){

    }


}





/*
FINRA:
1. Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number.
2. For numbers which are a multiple of 5 print "RA" instead of the number.
3. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */