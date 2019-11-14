package StudentInfoSystem;

import java.util.List;

public interface StudentManager {
    public void addStudents(Student student) throws RuntimeException;

    public void deleteStudents(String id);

    public void modifyStudent(String id, Student student);

    public Student findStudent(String name);

    public int getStudentCount();

    public List<Student> getStudents();
}
