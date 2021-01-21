package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    // name
    private String name;

    // list of students
    ArrayList<Student> students;

    // worth number of credits
    private int worthNumberOfCredits;

    // constructors
    public Course (String name, int numberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course course = (Course) o;
//        return worthNumberOfCredits == course.worthNumberOfCredits && Objects.equals(name, course.name) && Objects.equals(students, course.students);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, students, worthNumberOfCredits);
//    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) {
            return false;}
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) {
            return true;
        }
        else {
            return false; }
    }
}
