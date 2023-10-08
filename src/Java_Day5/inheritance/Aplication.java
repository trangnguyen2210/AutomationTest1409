package Java_Day5.inheritance;

public class Aplication {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.setName("Nguyễn Văn A");
        sv.diChoi();
        sv.maSinhVien = "SV01";
        sv.diHoc();

        GiaoVien gv = new GiaoVien();
        gv.setName("Nguyễn Văn B");
        gv.diChoi();
        gv.maGiaoVien = "GV01";
        gv.diDay();
    }
}


