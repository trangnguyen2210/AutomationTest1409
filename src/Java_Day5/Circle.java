package Java_Day5;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw with color " + getColor() + " for circle");
    }
}
