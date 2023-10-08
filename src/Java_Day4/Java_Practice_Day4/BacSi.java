package Java_Day4.Java_Practice_Day4;

public class BacSi {
    public static void main(String[] args) {
        Nguoi bacSi = new Nguoi();
        bacSi.setHoVaTen("Bác Sỹ C");
        bacSi.setNgaySinh("03/12/1875");
        bacSi.setQueQuan("Hà Nội");
        System.out.println("Họ và tên: " + bacSi.getHoVaTen() + "\nNgày sinh: " + bacSi.getNgaySinh() + "\nQuê quán: " + bacSi.getQueQuan() + " \nSố điện thoại: " + bacSi.getSoDienThoai());
        bacSi.diChoi("Sau khi xong việc");
        double luongbacSi = bacSi.luong((float)2);
        System.out.println("Lương " + luongbacSi);
    }
}
