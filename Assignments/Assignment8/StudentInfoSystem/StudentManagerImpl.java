package StudentInfoSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManagerImpl implements StudentManager {
    private HashMap<String, Student> studentMap = new HashMap<>();

    @Override
    public void addStudents(Student student) throws RuntimeException {
        String id = student.getId();
        Student s = studentMap.get(id);
        if (s == null) {
            studentMap.put(student.getId(), student);
        }
        else {
            throw new RuntimeException("Student already exist");
        }
    }

    @Override
    public void deleteStudents(String id) {
        studentMap.remove(id);
    }

    @Override
    public void modifyStudent(String id, Student student) {
        if (!id.equals(student.getId())) {
            throw new RuntimeException(id + "is not correct");
        }
        studentMap.put(id, student);
    }

    @Override
    public Student findStudent(String name) {
        for (Student s : studentMap.values()) {
            if (s.getName() == name) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getStudentCount() {
        return studentMap.size();
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<Student>(studentMap.values());
    }

    public static void main(String[] args) {
        StudentManagerImpl stuManImp = new StudentManagerImpl();
    }
}
