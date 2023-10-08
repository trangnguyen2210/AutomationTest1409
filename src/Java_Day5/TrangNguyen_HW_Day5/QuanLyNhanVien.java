package Java_Day5.TrangNguyen_HW_Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    public static NhanVien[] nhapDanhSachNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        NhanVien[] dsNhanVien = new NhanVien[soLuong];
        for (int i = 0; i < soLuong; i++) {
            dsNhanVien[i] = new NhanVien();

            System.out.println("Nhập tên: ");
            String ten = scanner.nextLine();
            dsNhanVien[i].setTen(ten);

            System.out.println("Nhập chức vụ: ");
            String chucVu = scanner.nextLine();
            dsNhanVien[i].setChucVu(chucVu);

            System.out.println("Nhập mã nhân viên: ");
            String maNhanVien = scanner.nextLine();
            dsNhanVien[i].setMaNhanVien(maNhanVien);

            System.out.println("Nhập lương: ");
            int luong = Integer.parseInt(scanner.nextLine());
            dsNhanVien[i].setLuong(luong);
        }
        return dsNhanVien;
    }

    public static void inDanhSachNhanVien(NhanVien[] dsNhanVien) {
        System.out.println("Dánh sách nhân viên là: ");
        for (NhanVien nhanVien : dsNhanVien) {
            System.out.println("Nhân viên tên: " + nhanVien.getTen() + ", chức vụ: " + nhanVien.getChucVu() + ", mã nhân viên: " + nhanVien.getMaNhanVien() + ", lương: " + nhanVien.getLuong());
        }
    }

    public static void inDanhSachKetQua(ArrayList<NhanVien> dsNhanVien) {
        System.out.println("Dánh sách nhân viên có mức lương cao hơn mức lương trung bình của phòng ban là: ");
        for (NhanVien nhanVien : dsNhanVien) {
            System.out.println("Nhân viên tên: " + nhanVien.getTen() + ", chức vụ: " + nhanVien.getChucVu() + ", mã nhân viên: " + nhanVien.getMaNhanVien() + ", lương: " +  nhanVien.getLuong());
        }
    }

    public static double tinhTongLuongNhanVien(NhanVien[] dsNhanVien) {
        double tongLuong = 0;
        for (NhanVien nhanVien : dsNhanVien) {
            tongLuong += nhanVien.getLuong();
        }
        return tongLuong;
    }

    public static double tinhTrungBinhLuongNhanVien(NhanVien[] dsNhanVien) {
        double tongLuong = 0;
        for (NhanVien nhanVien : dsNhanVien) {
            tongLuong += nhanVien.getLuong();
        }
        return tongLuong/dsNhanVien.length;
    }

    public static ArrayList<NhanVien> timNhanVienCoLuongCaoHonLuongTrungBinh(NhanVien[] dsNhanVien, double tbTongLuong) {
        ArrayList<NhanVien> danhSachKetQua = new ArrayList<>();
        for (int i = 0; i < dsNhanVien.length; i++) {
            if (dsNhanVien[i].getLuong() > tbTongLuong) {
                danhSachKetQua.add(dsNhanVien[i]);
            }
        }
        return danhSachKetQua;
    }
}
