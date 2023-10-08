package Java_Day5.pratice;

public class Application {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setTenHinh("Hình tròn 1");
        hinhTron.banKinh = 2;
        System.out.println("Tên hình tròn: " + hinhTron.getTenHinh());
        hinhTron.tinhDienTich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setTenHinh("Hình vuông 1");
        hinhVuong.chieuDaiMotCanh = 4;
        System.out.println("Tên hình vuông: " + hinhVuong.getTenHinh());
        hinhVuong.tinhDienTich();
    }

}
