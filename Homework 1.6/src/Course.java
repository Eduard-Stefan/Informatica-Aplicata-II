import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    public Course(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void AddStudentToCourse(Student student) {
        students.add(student);
        student.AddCourse(this);
    }
    public void RemoveStudentFromCourse(Student student) {
        students.remove(student);
        student.RemoveCourse(this);
    }
    public void AddTeacherToCourse(Teacher teacher) {
        teachers.add(teacher);
        teacher.AddCourse(this);
    }
    public void RemoveTeacherFromCourse(Teacher teacher) {
        teachers.remove(teacher);
        teacher.RemoveCourse(this);
    }
    public void ChangeTeacherAddress(Teacher teacher, Address address) {
        teacher.SetAddress(address);
    }
    public void ChangeStudentAddress(Student student, Address address) {
        student.SetAddress(address);
    }
    public static Course CreateNewCourse(String name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
        Course course = new Course(name);
        for (Teacher teacher : teachers) {
            course.AddTeacherToCourse(teacher);
        }
        for (Student student : students) {
            course.AddStudentToCourse(student);
        }
        return course;
    }
}