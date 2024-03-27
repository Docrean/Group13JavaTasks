package Michael.week_1;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOperatorMethod(20,2);

    }

    public static void divideWithoutDivisionOperatorMethod(int num3, int num4) {
        if(num4==0) {
            System.out.println("Invalid Number");
        }

        System.out.print(num3 +" divide by "+num4 +" is: ");
        int count =0;
        while(num3 >= num4) {   ///0   3
            num3 -= num4;    // 0
            count++;   // 3
        }
        System.out.println(count+" and remainder is "+num3);
    }

}
