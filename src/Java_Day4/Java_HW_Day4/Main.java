package Java_Day4.Java_HW_Day4;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setEmployee_id(123345);
        dev.setEmployee_name("Dev A");
        System.out.println("Id: " + dev.getEmployee_id() + ", name: " + dev.getEmployee_name() + ", salary: " + dev.getEmployee_salary());

        XeMay xeMay1 = new XeMay();
        xeMay1.setLoaiXe("xe máy");
        xeMay1.setTenXe("Vision");
        xeMay1.setVanTocMax(80);
        System.out.println("Loại xe: " + xeMay1.getLoaiXe() + ", tên xe: " + xeMay1.getTenXe() + ", vận tốc tối đa: " + xeMay1.getVanTocMax());

        XeTaxi taxi = new XeTaxi();
        taxi.setLoaiXe("taxi");
        taxi.setTenXe("ABC");
        taxi.setVanTocMax(100);
        System.out.println("Loại xe: " + taxi.getLoaiXe() + ", tên xe: " + taxi.getTenXe() + ", vận tốc tối đa: " + taxi.getVanTocMax());
    }
}
