package Java_Day4.Java_HW_Day4;

public class Xe {
    /* - Xây dựng lớp Xe với các thuộc tính TenXe, LoaiXe,
        VanTocMax. Các Setter (setTenXe, setLoaiXe,
        setVanTocMax) và các Getter (getTenXe, getLoaiXe,
        getVanTocMax)
        - Áp dụng tính đóng gói tạo lớp XeMay và XeTaxi để
        set, get và in ra TenXe, LoaiXe và VanTocMax */

    private String TenXe;
    private String LoaiXe;
    private int VanTocMax;

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String tenXe) {
        TenXe = tenXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    public int getVanTocMax() {
        return VanTocMax;
    }

    public void setVanTocMax(int vanTocMax) {
        VanTocMax = vanTocMax;
    }
}
