public class Student {
    //properties
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    //constructors
    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    //methods
    //getters
    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public int getYearLevel() {return yearLevel;}
    public static int getStudentCount() {return studentCount;}
    //setters
    public void setFirstName(String fName) {firstName = fName;}
    public void setLastName(String lName) {lastName = lName;}
    public void setAge(int a) {age = a;}
    public void setYearLevel(int yl) {yearLevel = yl;}
    //other
    public boolean equals(Student a, Student b) {
        if((a.id == b.id) && (a.firstName.equals(b.firstName)) && (a.lastName.equals(b.lastName)) && (a.age == b.age) && (a.yearLevel == b.yearLevel)) return true;
        else return false;
    }
    public String toString(Student a) {
        return "Student{id=" + a.id + ", firstName='" + a.firstName + "', lastName='" + a.lastName + "', age=" + a.age + ", yearLevel=" + a.yearLevel + "}";
    }
    // Student{id=, firstName='Adrian', lastName='Wong', age=17, yearLevel=12}
}
