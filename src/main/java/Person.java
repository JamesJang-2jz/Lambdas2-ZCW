import java.time.LocalDate;

public class Person {

    public enum Sex{
        Male,
        Female

    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    public int getAge() {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {


    }




}
