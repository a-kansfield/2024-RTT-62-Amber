package misc.college;

public class Student {
    //region Encapsulation
    //      The act of keeping variables private within a class,
    //      and only allowing them to be called through getters and setters
    //endregion
    private int     attributeNum = 5;

    private int     studentID;              //region UniqueID
                                        // Not covered yet but this would be a unique identifier.
                                        // Something that is unique to every object and can be used when you need to search for a specific object.
                                        // endregion
    private int     age;
    private double  gpa;
    private String  name;
    private String  major;

    //region Constructors
    //  Special method used when objects are created/initialized.
    //  This method is optional, but adding it will allow you to set values when the object is created.
    //
    //  Rules:      1. Method name needs to be the same as the class name
    //              2. Can't be abstract, final, or static
    //              3. No return type.
    //              4. Can't be called by itself. (It's run automatically when an object is created.)
    //endregion
    public Student() {

    } // Default/Empty constructor

    public Student(int id, double gpa, String name, String major, int age){
        this.studentID  = id;
        this.age        = age;
        this.gpa        = gpa;
        this.name       = name;
        this.major      = major;
    } // Complete constructor with all variables


    //Getters and Setters
    public int getAttributeNum() {
        return attributeNum;
    }
    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "studentID="    + studentID +
                ", age="        + age +
                ", gpa="        + gpa +
                ", name='"      + name + '\'' +
                ", major='"     + major + '\'' +
                '}';
    }
}
