public class Vehicle {
  String model;
  String make;
  int year;
  String fuelType;

  Vehicle(String model, String make, int year, String fuelType) {
    this.model = model;
    this.make = make;
    this.year = year;
    this.fuelType = fuelType;
  }

  public double calcEfficiency(int distance, int fuelConsumed) {
    return (double) distance / fuelConsumed;
  }

  public int calcDistance(int time, int speed) {
    return time * speed;
  }

  public int maxSpeed() {
    return 0;
  }

  public static void main(String[] args) {
    Truck t = new Truck("F-150", "Ford", 2020, "Petrol");
    Car c = new Car("Civic", "Honda", 2022, "Petrol");
    Motorcycle m = new Motorcycle("Ninja", "Kawasaki", 2022, "Petrol");

    int distance = 150;
    int fuelConsumed = 10;
    int time = 2;
    int speed = 75;

    System.out.println("Truck:\n fuel efficiency: " + t.calcEfficiency(distance, fuelConsumed) + ", distance traveled: "
        + t.calcDistance(time, speed) + " ,kmph speed: " + t.maxSpeed());

    System.out.println("Car:\n fuel efficiency: " + c.calcEfficiency(distance, fuelConsumed) + ", distance traveled: "
        + c.calcDistance(time, speed) + " ,kmph speed: " + c.maxSpeed());

    System.out.println("Car:\n fuel efficiency: " + m.calcEfficiency(distance, fuelConsumed) + ", distance traveled: "
        + m.calcDistance(time, speed) + " ,kmph speed: " + m.maxSpeed());
  }
}

class Truck extends Vehicle {
  public Truck(String model, String make, int year, String fuelType) {
    super(model, make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 180;
  }
}

class Car extends Vehicle {
  public Car(String model, String make, int year, String fuelType) {
    super(model, make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 200;
  }
}

class Motorcycle extends Vehicle {
  public Motorcycle(String model, String make, int year, String fuelType) {
    super(model, make, year, fuelType);
  }

  @Override
  public int maxSpeed() {
    return 160;
  }
}
