public class Dog {
  String name, color;

  Dog(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public static void main(String[] args) {
    Dog d = new Dog("doggo", "red");
    System.out.println("Dog name: " + d.name + ", Color: " + d.color);
  }
}
