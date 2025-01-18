package Day2;

import java.util.Scanner;

public class FiboRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 3) {
            System.out.println("Число должно быть больше 3.");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
        private static int fibonacci ( int n){
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
