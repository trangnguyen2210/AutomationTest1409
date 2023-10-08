package Java_Day4.Java_Practice_Day4;

public class GiaoVien {
    public static void main(String[] args) {
        Nguoi giaoVien = new Nguoi();
        giaoVien.setHoVaTen("Giáo viên B");
        giaoVien.setNgaySinh("03/12/1885");
        giaoVien.setQueQuan("HCM");
        System.out.println("Họ và tên: " + giaoVien.getHoVaTen() + "\nNgày sinh: " + giaoVien.getNgaySinh() + "\nQuê quán: " + giaoVien.getQueQuan() + " \nSố điện thoại: " + giaoVien.getSoDienThoai());
        giaoVien.diChoi("Sau khi xong việc");
        double luongGiaoVien = giaoVien.luong((float)1.5);
        System.out.println("Lương " + luongGiaoVien);
    }
}
