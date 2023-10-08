package Java_Day5.inheritance;

public class SinhVien extends Nguoi{
    public String maSinhVien; // thuộc tính riêng cho sinh viên

    @Override
    public void diChoi() {
        System.out.println(getName() + "đi chơi sau khi học xong");
    }
    // Hàm riêng triển khai object sinh viên
    public void diHoc() {
        System.out.println("Sinh viên " + maSinhVien + " đi học 5 ngày một tuần");
    }
}
