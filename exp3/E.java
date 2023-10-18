import java.util.Vector;

abstract class Person {

  public String name;
  public int age;
}

class Employee extends Person {

  public String empId, department;
  public int level;

  Employee(String name, int age, String empId, String department, int level) {
    this.name = name;
    this.age = age;
    this.empId = empId;
    this.department = department;
    this.level = level;
  }

  void print() {
    System.out.println("I am a Employee");
    System.out.printf("My name is %s,I am %d years old.\n", name, age);
    System.out.printf(
      "I am a %d level Employee.My employeeNumber is %s.I am working in %s\n",
      level,
      empId,
      department
    );
  }
}

class Manager extends Employee {

  private Vector<Employee> subordinate;

  Manager(String name, int age, String empId, String department, int level) {
    super(name, age, empId, department, level);
    subordinate = new Vector<Employee>();
  }

  public Vector<Employee> getSubordinates() {
    return subordinate;
  }

  void print() {
    System.out.println("I am a Manager");
    System.out.printf("My name is %s,I am %d years old.\n", name, age);
    System.out.printf(
      "I am a %d level Employee.My employeeNumber is %s.I am working in %s\n",
      level,
      empId,
      department
    );
    System.out.println("My subordinate has:");
    for (int i = 0; i < subordinate.size() - 1; i++) System.out.print(
      subordinate.get(i).name + ","
    );
    System.out.println(subordinate.get(subordinate.size() - 1).name + '.');
  }
}

public class E {

  public static void main(String arg[]) {
    Employee e1 = new Employee("zhangsan", 20, "s101", "d01", 3);
    e1.print();
    System.out.println();

    Employee e2 = new Employee("lisi", 20, "s202", "d02", 4);
    e2.print();
    System.out.println();

    e2 = new Employee("maliu", 20, "s102", "d01", 5);

    Manager m1 = new Manager("wangwu", 30, "s100", "d01", 9);

    m1.getSubordinates().addElement(e1);
    m1.getSubordinates().addElement(e2);
    m1.print();
    System.out.println();
  }
}
