package module;

public class Student {
    private String name;
    private Gender gender;

    public Student() {
    }

    public Student(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void findFemaleAndPrint() {
        if( this.gender == Gender.FEMALE) {
            System.out.println("I am " + this.name + " and I am female.");
        }
    }
}
