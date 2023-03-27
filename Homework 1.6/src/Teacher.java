import java.util.ArrayList;

public class Teacher extends Person {
    private String subject;
    private ArrayList<Course> courses;
    public Teacher(String name, Address address, String subject) {
        super(name, address);
        this.subject = subject;
        this.courses = new ArrayList<>();
    }
    public String GetSubject() {
        return subject;
    }
    public void SetSubject(String subject) {
        this.subject = subject;
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