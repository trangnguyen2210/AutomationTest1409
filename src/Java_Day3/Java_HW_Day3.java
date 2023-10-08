package Java_Day3;

import java.util.Scanner;

public class Java_HW_Day3 {
    public static void main(String[] args) {
        DescendingBubbleSort();
        CheckArray();
    }

    public static int[] InputArray() {
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

    /*Bai 1: sap xep day so theo thu tu giam dan*/
    public static void DescendingBubbleSort() {
       int[] array = InputArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Dãy số sau sắp xếp");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*Bài 2: tìm số chia hết cho 2 và 3*/
    public static void CheckArray() {
        int[] array = InputArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 == 0) {
                System.out.println("Điều kiện thoát xảy ra");
                return;
            }
        }
    }
}
