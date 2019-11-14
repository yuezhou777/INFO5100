package StudentInfoSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class StudentManagerFileImpl implements StudentManager {
    private StudentManager stuManager = new StudentManagerImpl();
    private String file = "/Users/yuezhou/Code/5100/Assignment8/StudentInfoSystem/students.txt";

    public StudentManagerFileImpl() throws Exception{
        readDataFromFileToStuManager();
    }

    private void readDataFromFileToStuManager() throws Exception{
        File f = new File(file);
        if (f.exists() == false) return;
        FileInputStream fis = new FileInputStream(f);
        Scanner s = new Scanner(fis);
        while (s.hasNext()) {
            String l = s.nextLine();
            String[] line = l.split("\\|");
            Student student = new Student(line[0], line[1]);
            stuManager.addStudents(student);
        }
    }

    @Override
    public void addStudents(Student student) throws RuntimeException {
        stuManager.addStudents(student);
        writeIntoFile(student);
    }

    private void writeIntoFile(Student student) {
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(student.getId() +"|"+ student.getName());
            fos.close();
        } catch(Exception e) { }
    }

    @Override
    public void deleteStudents(String id) {
        stuManager.deleteStudents(id);
        rewriteContentsIntoFile();
    }

    private void rewriteContentsIntoFile() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            for (Student s : stuManager.getStudents()) {
                ps.println(s.getId() +"|"+ s.getName());
            }
        } catch(Exception e) { }

        try {
            fos.close();
        } catch(Exception e) { }
    }

    @Override
    public Student findStudent(String name) {
        return stuManager.findStudent(name);
    }

    @Override
    public int getStudentCount() {
        return stuManager.getStudentCount();
    }

    @Override
    public List<Student> getStudents() {
        return stuManager.getStudents();
    }

    @Override
    public void modifyStudent(String id, Student student) {
        stuManager.modifyStudent(id, student);
        rewriteContentsIntoFile();
    }
}
