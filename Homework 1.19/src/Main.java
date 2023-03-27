import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ion", 8));
        students.add(new Student("Ana", 7));
        students.add(new Student("Andrei", 9));
        students.add(new Student("Mihai", 6));
        System.out.println("List before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(Comparator.comparingInt(Student::getGrade));
        System.out.println("List after sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}