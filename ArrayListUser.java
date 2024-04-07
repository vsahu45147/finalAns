package java_problems_datastructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}

public class ArrayListUser {
    private ArrayList<User> userList;

    public ArrayListUser() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

    public void sortUsersByAge() {
        Collections.sort(userList, Comparator.comparingInt(User::getAge));
    }

    public static void main(String[] args) {
        ArrayListUser userList = new ArrayListUser();

        userList.addUser(new User("Alice", 25));
        userList.addUser(new User("Bob", 30));
        userList.addUser(new User("Charlie", 20));

        System.out.println("Before sorting:");
        userList.printUsers();

        userList.sortUsersByAge();

        System.out.println("\nAfter sorting by age:");
        userList.printUsers();
    }
}
