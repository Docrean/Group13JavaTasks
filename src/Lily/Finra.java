package Lily;

public class Finra {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i <= 30; i++){
            System.out.print(i + " ");
        }

        if (num *3 == 0) {
            System.out.println("FIN");
        } else if (num * 5 == 0) {
            System.out.println("RA");
        }else if (num * 3 == 0 && num * 5 == 0){
            System.out.println("FINRA");
        }

    }
}
