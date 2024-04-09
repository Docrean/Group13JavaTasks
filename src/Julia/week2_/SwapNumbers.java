package Julia.week2_;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 7;
        int b = 32;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
