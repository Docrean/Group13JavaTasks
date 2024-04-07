package Julia.week1_;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int num1=103;
        int num2=20;
       /*
       100-20=83
       83-20=63
       63-20=43
       44-20=23
       23-20=3

        */
        int counter=0;
        while (num1>=num2){
            num1=num1-num2;
            counter++;
        }

        System.out.println(counter+" with a remainder of "+num1);
    }



}
