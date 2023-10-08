package Java_Day4.Java_Practice_Day4;

public class SinhVien {
    public static void main(String[] args) {
        Nguoi sinhVien = new Nguoi();
        sinhVien.setHoVaTen("Sinh viên A");
        sinhVien.setNgaySinh("12/12/2005");
        sinhVien.setQueQuan("HCM");
        System.out.println("Họ và tên: " + sinhVien.getHoVaTen() + "\nNgày sinh: " + sinhVien.getNgaySinh() + "\nQuê quán: " + sinhVien.getQueQuan() + " \nSố điện thoại: " + sinhVien.getSoDienThoai());
        sinhVien.diChoi("Sau khi làm xong bài tập");
    }
}
