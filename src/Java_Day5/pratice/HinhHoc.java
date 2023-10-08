package Java_Day5.pratice;

public abstract class HinhHoc {
    private String tenHinh;

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract void tinhDienTich();
}
