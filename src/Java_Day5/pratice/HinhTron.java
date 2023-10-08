package Java_Day5.pratice;

public class HinhTron extends HinhHoc{
    public int banKinh;
    @Override
    public void tinhDienTich() {
        System.out.println("Diện tch hình tròn: " + 2 * 3.14 * banKinh);
    }
}
