package Java_Day4.Java_Practice_Day4;

public class Nguoi {
    private String hoVaTen;
    private String ngaySinh;
    private String queQuan;
    private String soDienThoai = "0987654321";

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void diChoi(String cachDiChoi) {
        System.out.println("Đi chơi: " + cachDiChoi);
    }

    public double luong(float heSoLuong) {
        return 5000000 * heSoLuong;
    }
}
