abstract public class Bird {
  abstract void fly();

  abstract void makeSound();

  public static void main(String[] args) {
    Bird e = new Eagle();
    Bird h = new Hawk();

    System.out.println("Eagle:");
    e.fly();
    e.makeSound();

    System.out.println("Hawk:");
    h.fly();
    h.makeSound();
  }
}

class Eagle extends Bird {
  void fly() {
    System.out.println("flying style: high sky");
  }

  void makeSound() {
    System.out.println("sound: sharp screech");
  }
}

class Hawk extends Bird {
  void fly() {
    System.out.println("flying style: swiftly through air");
  }

  void makeSound() {
    System.out.println("sound: high pitched cry.");
  }
}
