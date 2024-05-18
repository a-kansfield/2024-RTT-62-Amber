package misc.college;

public class Student {
    //region Encapsulation
    //      The act of keeping variables private within a class,
    //      and only allowing them to be called through getters and setters
    //endregion
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

    public Student(int id, int age, double gpa, String name, String major){
        this.studentID  = id;
        this.age        = age;
        this.gpa        = gpa;
        this.name       = name;
        this.major      = major;
    } // Complete constructor with all variables

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
