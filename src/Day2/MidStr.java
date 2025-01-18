package Day2;


import java.util.Scanner;

public class MidStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] mass = new String[n];
        for (int i = 0; i <= n; i++) {
            String str = sc.nextLine();
            int len = str.length();
            if (len>0){
                int mid = len/2;
                if (len%2==0){
                   System.out.println(str.charAt(mid-1)+""+str.charAt(mid));
               }
               else{
                   System.out.println(str.charAt(mid));
               }
           }
        }
    }
}
