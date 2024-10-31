interface Flyable {
  void fly_obj();
}

class Spacecraft implements Flyable {
  public void fly_obj() {
    System.out.println("flies in 350k ft");
  }
}

class Airplane implements Flyable {
  public void fly_obj() {
    System.out.println("flies in 31k to 42k ft");
  }
}

class Helicopter implements Flyable {
  public void fly_obj() {
    System.out.println("flies in 5k to 14k ft");
  }
}

class FlyableMain {
  public static void main(String[] args) {
    Spacecraft s = new Spacecraft();
    Airplane a = new Airplane();
    Helicopter h = new Helicopter();

    s.fly_obj();
    a.fly_obj();
    h.fly_obj();
  }
}
