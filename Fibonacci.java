import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner joe = new Scanner(System.in);
        int nth = joe.nextInt();
        int n0 = 0;
        int n1 = 1;
        System.out.println(n0);
        System.out.println(n1);
        for (int i=2; i < nth; i++){
            int n3 = n0 + n1;
            n0 = n1;
            n1 = n3;
            System.out.println(n3);
        }
        /* O(n) */

    }
}
