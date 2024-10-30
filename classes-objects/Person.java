public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Person p = new Person("pechkas", 16);
    System.out.println("name: " + p.name + ", age: " + p.age);
  }
}
