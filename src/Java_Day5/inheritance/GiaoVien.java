package Java_Day5.inheritance;

public class GiaoVien extends Nguoi{
    public String maGiaoVien; // thuộc tính ri6eng cho giáo viên
    @Override
    public void diChoi() {
        System.out.println("Giáo viên " + getName() + " đi chơi vào ngày nghỉ");
    }

    public void diDay() {
        System.out.println("Giáo viên " + maGiaoVien + " dạy automation test vào thứ 4 và chủ nhật");
    }
}
