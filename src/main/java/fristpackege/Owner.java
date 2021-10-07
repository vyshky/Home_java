package fristpackege;

public class Owner {
    private String firstName;
    private String lastName;
    private int age;

    public Owner(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAge(age);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else this.age = 0;
    }

    public void infoOwner() {
        System.out.print("Владелец дома : ");
        System.out.println(firstName + " " + lastName + " , " + age + " лет");
    }

    public void tellAboutYourself() {

        System.out.println("\u001B[34m" + "Привет , " + "я " + firstName + " " + lastName + " и мне " + age + " лет" + "\u001B[0m");
    }

}
