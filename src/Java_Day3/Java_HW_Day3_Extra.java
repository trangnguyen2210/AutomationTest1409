package Java_Day3;

import java.util.Scanner;

public class Java_HW_Day3_Extra {
    public static void main(String[] args) {
        findTheSmallestNumber();
        findTheLargestNumber();
    }
    public static int[] InputIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void findTheSmallestNumber() {
        /* 1. Tìm giá trị nhỏ nhất của mảng số nguyên được nhập vào từ bàn phím.*/
        int[] array = InputIntArray();
        int min = 0;

        for (int element: array) {
            if (min > element || min == 0) {
                min = element;
            }
        }
        System.out.println("SỐ nhỏ nhất trong mảng là: " + min);
    }

    public static double[] InputDoubleArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = scanner.nextInt();
        double[] array = new double[n];

        System.out.println("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    private static void findTheLargestNumber() {
        /*2. Tìm giá trị lớn nhất của mảng số thập phân được nhập vào từ bàn phím.*/
        double[] array = InputDoubleArray();
        double min = 0;

        for (double element: array) {
            if (min < element || min == 0) {
                min = element;
            }
        }
        System.out.println("SỐ lớn nhất trong mảng là: " + min);
    }
}
