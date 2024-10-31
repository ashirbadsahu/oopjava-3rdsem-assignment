class Vehicle {
  void startEngine() {
    System.out.println("Starting vehicle engine.");
  }

  void stopEngine() {
    System.out.println("Stopping vehicle engine.");
  }

  public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle motorcycle = new Motorcycle();

    car.startEngine();
    car.stopEngine();

    motorcycle.startEngine();
    motorcycle.stopEngine();
  }
}

class Car extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Starting car engine with a key.");
  }

  @Override
  void stopEngine() {
    System.out.println("Stopping car engine by turning the key off.");
  }
}

class Motorcycle extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Starting motorcycle engine with a button.");
  }

  @Override
  void stopEngine() {
    System.out.println("Stopping motorcycle engine by pressing the button.");
  }
}
