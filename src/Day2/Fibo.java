package Day2;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n<=3){
            System.out.println("введите число больше 3");
        }else {
            int a =0;
            int b = 1;
            for (int i = 0; i <n ; i++) {
                System.out.println(a);
                int next = a+b;
                a=b;
                b=next;
            }
        }
    }
}
