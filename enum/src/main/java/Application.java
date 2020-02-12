import module.Gender;
import module.Student;

public class Application {
    public static void main(String[] args) {
        Student stu1 = new Student("Linda", Gender.FEMALE);
        Student stu2 = new Student("Bob", Gender.MALE);
        Student stu3 = new Student("Solider", Gender.MALE);
        Student stu4 = new Student("Cindy", Gender.FEMALE);
        stu1.findFemaleAndPrint();
        stu2.findFemaleAndPrint();
        stu3.findFemaleAndPrint();
        stu4.findFemaleAndPrint();
    }

}
