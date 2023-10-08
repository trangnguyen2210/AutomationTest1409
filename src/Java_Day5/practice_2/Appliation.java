package Java_Day5.practice_2;

public class Appliation {
    public static void main(String[] args) {
        BacSi bacSi = new BacSi();

        System.out.println("Lương bác sĩ 1: " + String.format("%.1f", bacSi.tinhLuong(5000000, 1.5)));
        System.out.println("Lương bác sĩ 2: " + String.format("%.1f", bacSi.tinhLuong(5000000, 1.5, 2)));
        System.out.println("Lương bác sĩ 3: " + String.format("%.1f", bacSi.tinhLuong(5000000, 1.5, 2, 1)));
        System.out.println("Lương bác sĩ 4: " + String.format("%.1f", bacSi.tinhLuong(5000000, 1.5, 2, 2)));

    }
}
