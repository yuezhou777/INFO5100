package StudentInfoSystem;

import java.util.Objects;

public class Student implements Comparable{
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return s.getId().equals(this.getId());
    }

    public int hashCode() {
        return this.getId().hashCode();
    }

    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.getName() != s.getName()) {
            return this.getName().compareTo(s.getName());
        }
        return this.getId().compareTo(s.getId());
    }
}
