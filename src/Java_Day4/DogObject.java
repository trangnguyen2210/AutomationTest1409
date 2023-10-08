package Java_Day4;

public class DogObject {
    String breed;
    String size;
    int age;
    String color;
    public String getInfo() {
        return ("Breed is: " + breed+ ", size is: " + size + ", age: " + age + ", color is: " + color );
    }

    public static void main(String[] args) {
        DogObject corgi = new DogObject();
        corgi.breed = "Corgi";
        corgi.size = "small";
        corgi.age = 2;
        corgi.color = "black";
        System.out.println(corgi.getInfo());
    }
}
