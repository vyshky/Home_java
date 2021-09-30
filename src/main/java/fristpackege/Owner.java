package fristpackege;

public class Owner {
    private String firstName;
    private String lastName;
    private int age;

    public Owner(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SetAge(age);
    }

    public void SetAge(int age) {
        if (age > 0) {
            this.age = age;
        } else this.age = 0;
    }

    public void info() {
        System.out.print("Владелец дома : ");
        System.out.println(firstName + " " + lastName + " , " + age + " лет");
    }

    public void TellAboutYourself() {

        System.out.println("\u001B[34m" + "Привет , " + "я " + firstName + " " + lastName + " и мне " + age + " лет" + "\u001B[0m");
    }

}
