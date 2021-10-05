package fristpackege;


public class House {
    private Owner owner;
    private int floor;
    private String address;
    private String color;

    public House(Owner owner, int floor, String address, String color) {
        this.owner = owner;
        this.floor = floor;
        this.address = address;
        this.color = color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else color = "Не покрашен";
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void SetOwner(String firstName, String lastName, int age) {
        this.owner = new Owner(firstName, lastName, age);
    }

    public void getOwner() {
        owner.tellAboutYourself();
    }

    public void info() {
        owner.info();
        System.out.println("Этажей : " + floor);
        System.out.println("Адрес : " + address);
        System.out.println("Цвет : " + color);
    }

}
