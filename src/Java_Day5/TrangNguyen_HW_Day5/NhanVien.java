package Java_Day5.TrangNguyen_HW_Day5;

import java.util.Arrays;
import java.util.Scanner;

public class NhanVien {
    private String ten;
    private String chucVu;
    private String maNhanVien;
    private int luong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getLuong() {
        return  luong + ((luong * 10) / 100);
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}
