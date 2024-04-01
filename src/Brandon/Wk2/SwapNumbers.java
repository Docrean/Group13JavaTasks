package Brandon.Wk2;

public class SwapNumbers {

    //Swap two variables' values without using a third variable

    public static void main(String[] args) {

      int a = 10, b = 20;

      a = a + b;
      b = a - b;
      a = a - b;

        System.out.println(a);
        System.out.println(b);



    }
}
