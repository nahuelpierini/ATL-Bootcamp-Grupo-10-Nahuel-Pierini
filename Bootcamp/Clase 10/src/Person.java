import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private LocalDate Birthday;
    private int DNI;

    public Person(){

    }

    public Person(int id, String name, String surname, int age, LocalDate birthday, int DNI) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        Birthday = birthday;
        this.DNI = DNI;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", Birthday=" + Birthday +
                ", DNI=" + DNI +
                '}';
    }

    public boolean isOlder(int age){
        return age>=18;
    }
}
