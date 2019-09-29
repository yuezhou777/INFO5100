import java.util.*;
public class Class{
    private int courseId;
    private String courseName;
    private int maxCapacity;
    private int professorId;
    private int credits;
    private int[] studentIds;

    public Class(){

    }

    public Class(int courseId){
        this.courseId = courseId;
    }

    public Class(int courseId, int professorId){
        this.courseId = courseId;
        this.professorId = professorId;
    }

    public Class(int courseId, int professorId, int credits){
        this.courseId = courseId;
        this.professorId = professorId;
        this.credits = credits;
    }

    public void registerStudent(int studentId){

    }

    public Integer[] removeDuplicates(int[] studentIds) {
        List<Integer> list = new ArrayList<Integer>();
        int capacity = getMaxCapacity();
        Arrays.sort(studentIds);

        for(int i = 0; i <= Math.min(capacity, studentIds.length); i++){
            if(studentIds[i] != studentIds[i+1]){
                list.add(studentIds[i]);
            }
        }

        Integer[] course = list.toArray(new Integer[list.size()]);
        return course;
    }

    public int groupsOfStudents(int[] studentIds) {
        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i < studentIds.length; i++){
            if(studentIds[i] % 2 !=0){
                oddCount ++;
            }else{
                evenCount ++;
            }
        }
        
        int result = ((oddCount) * (oddCount - 1)) / 2 + ((evenCount) * (evenCount - 1)) / 2;
        return result; 
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        if(courseId <= 0){
            //throw new IllegalArgumentException("Not a right course id");
            System.out.println("Course id should be positive numbers");
        }
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName instanceof String){

        }else{
            System.out.println("Please enter correct course name"); 
        }

        if (number.length() < 10 || number.length() > 60){
            System.out.println("Please enter correct course name"); 
        }

        this.courseName = courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if(maxCapacity < 10 || maxCapacity > 100){
            System.out.println("Capacity should be greater than 10 less than 100"); 
        }
        this.maxCapacity = maxCapacity;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        if(professorId > 99999 && professorId < 1000000){
            this.professorId = professorId;
        }else{
            System.out.println("Id should be six digit integer"); 
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if(credits > 0 && credits < 10){
            this.credits = credits;
        }else{
            System.out.println("Please enter correct credit");
        }
    }

    public int[] getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(int[] studentIds) {
        this.studentIds = studentIds;
    }

}