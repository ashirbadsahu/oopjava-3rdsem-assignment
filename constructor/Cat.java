public class Cat {
  String name;
  int age;

  public Cat() {
    this.name = "Unknown";
    this.age = 0;
  }

  public static void main(String[] args) {
    Cat c = new Cat();
    System.out.println("cat name: " + c.name + " ,cat age: " + c.age);
  }
}
