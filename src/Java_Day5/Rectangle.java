package Java_Day5;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw with color " + getColor() + " for rectangle");
    }
}
