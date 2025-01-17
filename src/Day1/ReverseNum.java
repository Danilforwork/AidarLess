package Day1;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if (str.length()!=n){
            System.out.println("Ввели не n-значное число");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str).reverse();
        System.out.println(stringBuilder);
    }
}

