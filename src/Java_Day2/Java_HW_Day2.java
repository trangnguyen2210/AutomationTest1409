package Java_Day2;
import java.util.Arrays;
import java.util.Scanner;

public class Java_HW_Day2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=====");
        System.out.println("Nhap 1 de thuc hien phep tinh (1123*6745)/500");
        System.out.println("Nhap 2 de tim so lon nhat nhap tu ban phim");
        System.out.println("Nhap 3 de thuc thi voi mang");
        System.out.println("=====");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Ket qua la: " + (1123*6745)/500);
                break;
            case 2:
                System.out.println("Nhap so thu nhat: ");
                int soThuNhat = scanner.nextInt();
                System.out.println("Nhap so thu hai: ");
                int soThuHai = scanner.nextInt();
                if (soThuNhat > soThuHai) {
                    System.out.println("So lon nhat la: " + soThuNhat);
                } else {
                    System.out.println("So lon nhat la: " + soThuHai);
                }
                break;
            case 3:
                System.out.println("Nhap so phan tu mang: ");
                int n = scanner.nextInt();
                int[] mang = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap phan tu thu " + (i+1));
                    int phanTu = scanner.nextInt();
                    mang[i] = phanTu;
                    sum += phanTu;
                }
                System.out.println("Mang da nhap la: " + Arrays.toString(mang));
                System.out.println("Tong cac phan tu mang la: " + sum);
                break;
            default:
                System.out.println("Chuc nang nay chuong trinh chua ho tro");
        }
    }
}
