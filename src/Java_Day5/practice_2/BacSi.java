package Java_Day5.practice_2;

public class BacSi {
    public int luongCoBan = 5000000;
    public double tinhLuong (int luongCoBan, double heSoLuong) {
        return luongCoBan * heSoLuong;
    }
    public double tinhLuong (int luongCoBan, double heSoLuong, int soNamKinhNghiem) {
        return luongCoBan * heSoLuong * soNamKinhNghiem;
    }
    public double tinhLuong (int luongCoBan, double heSoLuong, int soNamKinhNghiem, int loaiBacSi) {
        if (loaiBacSi == 1) {
            return luongCoBan * heSoLuong * soNamKinhNghiem * 0.2;
        } else if (loaiBacSi == 2) {
            return luongCoBan * heSoLuong * soNamKinhNghiem * 0.45;
        } else
            return luongCoBan * heSoLuong * soNamKinhNghiem;
    }
//    public double tinhLuong (int luongCoBan, int heSoLuong, int soNamKinhNghiem, int loaiBacSi) {
//        if (loaiBacSi == 1) {
//            System.out.println("Lương bác sĩ: " + luongCoBan * heSoLuong * soNamKinhNghiem * 0.2);
//        } else if (loaiBacSi == 2) {
//            System.out.println("Lương bác sĩ: " + luongCoBan * heSoLuong * soNamKinhNghiem * 0.45);
//        } else
//    }

}
