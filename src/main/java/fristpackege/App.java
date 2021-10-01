package fristpackege; // namespace

public class App {
    public static void main(String[] args) {

        String firstName = "Джесси";
        String lastName = "Пинкман";
        int age = 42;
        Owner owner = new Owner(firstName, lastName, age);

        int floor = 10;
        String address = "Москва ул.Труда дом 14 кв 64";
        String color = "Синий";
        House house = new House(owner, floor, address, color);

        house.getOwner();
        house.info();
    }
}
