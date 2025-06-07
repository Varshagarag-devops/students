package program;

class Student {
private String name;
private String dob; // In format YYYY-MM-DD
public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
}
public void display() {
String birthYear = dob.substring(0, 4);
int age = 2025 - Integer.parseInt(birthYear); // Assuming current year is 2025
System.out.println("Student Name: " + name);
System.out.println("Date of Birth: " + dob);
System.out.println("Age: " + age);
}
}
public class Main{
public static void main(String[] args) {
Student s = new Student("kiran", "2005-08-26");
s.display();
}
}