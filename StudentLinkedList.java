package java_problems_datastructures;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // Override equals method to check equality based on all fields
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                Double.compare(student.mark, mark) == 0 &&
                name.equals(student.name);
    }
}

public class StudentLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        // Adding sample student objects
        studentList.add(new Student("Alice", 20, 85.5));
        studentList.add(new Student("Bob", 21, 75.0));
        studentList.add(new Student("Charlie", 22, 90.5));

        // (a) Display the list
        System.out.println("Student List:");
        displayList(studentList);

        // (b) Check existence of a student object
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a student name to check existence: ");
        String studentName = scanner.nextLine();
        Student studentToFind = new Student(studentName, 0, 0);
        boolean contains = studentList.contains(studentToFind);
        System.out.println("Contains the student (based on object reference): " + contains);
        if (!contains) {
            boolean exists = studentList.stream().anyMatch(s -> s.getName().equalsstudentName);
            System.out.println("Contains the student (based on name): " + exists);
        }

        // (c) Remove a specified student object
        System.out.println("\nEnter a student name to remove: ");
        studentName = scanner.nextLine();
        Student studentToRemove = new Student(studentName, 0, 0);
        boolean removed = studentList.remove(studentToRemove);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        // (d) Count the number of objects present in the list
        System.out.println("\nNumber of students in the list: " + studentList.size());

        // (e) Override equals method checking if the two Student objects share all the same values.
        Student student1 = new Student("Alice", 20, 85.5);
        Student student2 = new Student("Alice", 20, 85.5);
        System.out.println("\nEquality based on all fields:");
        System.out.println("student1.equals(student2): " + student1.equals(student2));
    }

    // Method to display the student list
    public static void displayList(LinkedList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
        }
    }
}
