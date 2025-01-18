package Day1;

import java.util.Scanner;

public class VozMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        if (mass.length!=n){
            System.out.println("ввели неверное число");
        }
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (mass[i] > mass[i + 1]) { //fix усл 3 1 1 2 было true и тд
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}

