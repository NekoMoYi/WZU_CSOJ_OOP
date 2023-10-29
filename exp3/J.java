import java.util.*;

class Student {
    String id;
    String name;
    String gender;
    double chinese;
    double math;
    double english;
    double average;
    double total;

    public Student(String id, String name, String gender, double chinese, double math, double english) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.average = (chinese + math + english) / 3;
        this.total = chinese + math + english;
    }

    public String toString() {
        return String.format("%s %s %s %.2f %.2f %.2f %.2f %.2f", id, name, gender, chinese, math, english, average, total);
    }
}

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (sc.hasNext()) {
            String command = sc.next();
            if (command.equals("INSERT")) {
                String id = sc.next();
                String name = sc.next();
                String gender = sc.next();
                double chinese = sc.nextDouble();
                double math = sc.nextDouble();
                double english = sc.nextDouble();
                Student student = new Student(id, name, gender, chinese, math, english);
                students.add(student);
                System.out.println(student);
            } else if (command.equals("LIST")) {
                students.sort(Comparator.comparing(student -> student.id));
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (command.equals("QUIT")) {
                System.out.println("Good bye!");
                break;
            }
        }
    sc.close();
    }
}
