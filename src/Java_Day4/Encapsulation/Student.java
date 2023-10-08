package Java_Day4.Encapsulation;

public class Student {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Student A");
        System.out.println("Name is: " + person.getName());
        person.setPhoneNumber("0987654321");
        System.out.println("Phone number is: " + person.getPhoneNumber());
    }
}
