import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HH");
        Student student2 = new Student("Hung", 21, "HH");
        Student student3 = new Student("Ha", 22, "HH");

        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);

        for (HashMap.Entry<Integer, Student> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("\n-----------------Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
