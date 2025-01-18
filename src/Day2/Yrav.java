package Day2;

import java.util.Scanner;

public class Yrav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 0) {
            System.out.println("Это не квадратное уравнение.");
        }
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The first root is " + root1 +"\n The second root is " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("The first root is " + root);
        } else {
            System.out.println("No roots");
        }
    }
}
