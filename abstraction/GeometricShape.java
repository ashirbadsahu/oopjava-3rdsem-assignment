abstract class GeometricShape {
  abstract double area();

  abstract double perimeter();

  public static void main(String[] args) {
    GeometricShape t = new Triangle(5, 4, 5, 5, 6);
    GeometricShape s = new Square(4);

    System.out.println("Triangle:");
    System.out.println("Area: " + t.area());
    System.out.println("Perimeter: " + t.perimeter());

    System.out.println("\nSquare:");
    System.out.println("Area: " + s.area());
    System.out.println("Perimeter: " + s.perimeter());
  }
}

class Triangle extends GeometricShape {
  private double base;
  private double height;
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double base, double height, double side1, double side2, double side3) {
    this.base = base;
    this.height = height;
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  double area() {
    return (base * height) / 2;
  }

  double perimeter() {
    return side1 + side2 + side3;
  }
}

class Square extends GeometricShape {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  double area() {
    return side * side;
  }

  double perimeter() {
    return 4 * side;
  }
}
