package program;

class StudentCourses {
private String semester;
private String course1;
private int marks1;
private String course2;
private int marks2;
public StudentCourses(String semester, String course1, int marks1, String course2, int
marks2) {
 this.semester = semester;
 this.course1 = course1;
 this.marks1 = marks1;
 this.course2 = course2;
 this.marks2 = marks2;
}
public void display() {
System.out.println("Semester: " + semester);
System.out.println("Course: " + course1 + " - Marks: " + marks1);
System.out.println("Course: " + course2 + " - Marks: " + marks2);
}
public static void main(String[] args) {
StudentCourses sc = new StudentCourses("Semester 1", "Math", 85, "Science", 90);
sc.display();
}
}
