package org.launchcode.java.demos.lsn4classes2;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Kyle", 1, 30, 4.0);
        Student twin = new Student("Kyle", 2, 20, 2.0);
        Teacher theTeacher = new Teacher("first", "last", "science", 2);
//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);
//        myself.addGrade(3, 3.0);
//        System.out.println(myself.gpa);
//        myself.addGrade(3, 3.0);
//        System.out.println(myself.gpa);
//        System.out.println(myself.toString());
//        System.out.println(myself.equals(twin));
//        System.out.println(myself.equals(theTeacher));
        Course myFirstCourse = new Course( "My First Course", 2);
        Course mySecondCourse = new Course( "My Second course", 3);
        System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println(myFirstCourse.toString());

    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public void addGrade(int courseCredits, double grade) {

        // current total quality score = letter grade * number of credits
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        // quality score for a class is found by multiplying the letter grade score by the number of credits
        // use information from parameters
        double newQualityScore =  grade * courseCredits;

        // update Current total quality score with the new quality score
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        // Update students total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        // Compute gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // Freshman (0 - 29 credits), Sophomore (30 - 59 credits), Junior (60 - 89 credits), or Senior (90+ credits)
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >=90) {
            return "Senior";
        } else {   // catch all statement
            return null;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        // objects are not equal
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        // is string name equal to this.name
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;

    }

    // getters and setters
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) { this.gpa = gpa; }

}



