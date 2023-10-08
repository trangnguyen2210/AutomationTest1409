package Java_Day3;

import java.util.Scanner;

public class Java_Day3 {
    public static void main(String[] args) {
        bubbleSort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang kinh nghiem: ");
        int x = scanner.nextInt();
        String title = printTitle(x);
        System.out.println(title);
    }
    public static void bubbleSort() {
        int [] arr = {5, 2, 7, 3, 4, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp;
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang da sap xep: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang kinh nghiem: ");
        int x = scanner.nextInt();
        String title = printTitle(x);
        System.out.println(title);
    }

    public static String printTitle(int soThang) {
        if (soThang < 6) {
            return "Junior";
        } else  if ( soThang <= 24) {
            return "Fresher";
        } else if ( soThang <=48 ) {
            return "Senior";
        } else {
            return "Special list";
        }
    }
}
