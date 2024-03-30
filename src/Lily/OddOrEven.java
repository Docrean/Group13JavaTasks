package Lily;

public class OddOrEven {

    public static void main(String[] args) {
        oddOrEven(150);
        oddOrEven(100);

    }

    public static void oddOrEven(int num) {

        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
