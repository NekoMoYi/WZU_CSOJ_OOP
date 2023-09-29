import java.util.Scanner;

class student {
    private String id, name, gender;
    private float chinese, math, english;

    public student(String id, String name, String gender, float chinese, float math, float english) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String toString() {
        float sum = this.chinese + this.math + this.english;
        float avg = sum / 3;
        return String.format("%s %s %s %.2f %.2f %.2f %.2f %.2f", this.id, this.name, this.gender, this.chinese, this.math,
                this.english, avg, sum);
    }
}

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student(sc.next(), sc.next(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(s);
        sc.close();
    }
}
