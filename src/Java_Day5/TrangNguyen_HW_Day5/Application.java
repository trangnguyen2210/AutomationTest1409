package Java_Day5.TrangNguyen_HW_Day5;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
       NhanVien[] danhSachNhanVien = QuanLyNhanVien.nhapDanhSachNhanVien();
       QuanLyNhanVien.inDanhSachNhanVien(danhSachNhanVien);
       double tongLuong = QuanLyNhanVien.tinhTongLuongNhanVien(danhSachNhanVien);
       System.out.println("Tổng chi phí trả lương cho nhân viên: " + String.format("%.1f", tongLuong));
       double trungBinhLuong =QuanLyNhanVien.tinhTrungBinhLuongNhanVien(danhSachNhanVien);
       ArrayList<NhanVien> danhSachKetQua = QuanLyNhanVien.timNhanVienCoLuongCaoHonLuongTrungBinh(danhSachNhanVien, trungBinhLuong);
       QuanLyNhanVien.inDanhSachKetQua(danhSachKetQua);
    }
}
