package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        double min = findMin(numbers);
        double max = findMax(numbers);
        double average = calculateAverage(numbers);
        double median = calculateMedian(numbers);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Медиана: " + median);
    }

    public static double findMin(int[] arr) {
        double min = arr[0];
        for (double num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findMax(int[] arr) {
        double max = arr[0];
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }
}
