package Java_Day5.pratice;

public class HinhVuong extends HinhHoc {
    public int chieuDaiMotCanh;

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình vuông: " + chieuDaiMotCanh * chieuDaiMotCanh);
    }
}
