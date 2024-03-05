import java.util.ArrayList;
public class ClassSection {
    //properties
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    //constructors
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList();
    }

    //methods
    //getters
    public String getSubject() {return subject;}
    public int getCapacity() {return capacity;}
    public int getYearLevel() {return yearLevel;}
    public ArrayList<Student> getStudents() {return students;}
    //setters
    public void setSubject(String subject1) {subject = subject1;}
    public void setCapacity(int capacity1) {capacity = capacity1;}
    public void setYearLevel(int yearLevel1) {yearLevel = yearLevel1;}
    //others
    public void addStudent(Student student) {
        int sameStudent = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) sameStudent = 1;
        }
        if (sameStudent == 0 && student.getYearLevel() == yearLevel) {
            students.add(student);
            capacity++;
        }
    }
    public void removeStudent(Student student) {
        students.remove(student);
        capacity --;
    }
    public boolean isStudentEnrolled(Student student) {
        for (int i = 0; i < students.size(); i++) {
            Student student1 = students.get(i);
            if (student1.equals(student)) return true;
        }
        return false;
    }
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=[]}";
    }
}
