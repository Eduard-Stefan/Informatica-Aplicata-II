import java.util.ArrayList;

public class Student extends Person {
    private int year;
    private ArrayList<Course> courses;
    public Student(String name, Address address, int year) {
        super(name, address);
        this.year = year;
        this.courses = new ArrayList<>();
    }
    public int GetYear() {
        return year;
    }
    public void SetYear(int year) {
        this.year = year;
    }
    public ArrayList<Course> GetCourses() {
        return courses;
    }
    public void AddCourse(Course course) {
        courses.add(course);
    }
    public void RemoveCourse(Course course) {
        courses.remove(course);
    }
}