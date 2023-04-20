package day22staticblockconstructors;

public class Student {

    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public Student(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }


    // OBJELERI EKRANDA GOREBILMEK ICIN TOSTRING methoduna ihtiyacimiz var: sag click,generate,toString,sec,OK bas
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';


        // yukardaki girilen formati siz degistirebilirsiniz.
    }
}