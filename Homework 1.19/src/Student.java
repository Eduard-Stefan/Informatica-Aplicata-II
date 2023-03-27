public class Student {
    private String name;
    private int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }
}