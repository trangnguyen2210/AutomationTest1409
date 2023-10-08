package Java_Day4;

public class MotorbikeObject {
    String name;
    String color;
    String bikeNumber;
    String registerDate;
    public String getInfo() {
        return ("Hãng xe: " + name+ ", màu: " + color + ", biển số: " + bikeNumber + ", ngày đăng ký: " + registerDate );
    }

    public static void main(String[] args) {
        MotorbikeObject vision = new MotorbikeObject();
        vision.name = "Vision";
        vision.color = "đen";
        vision.bikeNumber = "56-23 1234";
        vision.registerDate = "02-01-2020";
        System.out.println(vision.getInfo());
    }
}
