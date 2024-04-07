package Julia.week1_;

public class OddOrEvenNumbers2 {

    public static void main(String[] args) {
        isOddOrEven(5);
        isOddOrEven(6);

    }

    public static void isOddOrEven(int num) {

        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }

}
