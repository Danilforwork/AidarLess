package Day2;

import java.util.Scanner;

public class SumDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int perf=0;
        for (int i = 0; i <= n; i++) {
           if (isPerf(i)){
                perf++;
            }
        }
        System.out.println(perf);
    }

    private static boolean isPerf(int a) {
        int sum=0;
        for (int i = 1; i <=a/2 ; i++) {
            if (a%i==0){
                sum+=i;
            }
        }
        return sum==a;
    }
}
