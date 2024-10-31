public class Employee {
  String name;
  String address;
  String job;
  int Salary;

  Employee(String name, String address, String job, int Salary) {
    this.name = name;
    this.address = address;
    this.job = job;
    this.Salary = Salary;
  }

  double calcBonus(int Salary) {
    return Salary * 0.05;
  }

  String perfReport() {
    return "Good";
  }

  String project(String proj) {
    return ("Project assigned is: " + proj);
  }

  public static void main(String[] args) {
    Manager m = new Manager("Cognizant Khargosh", "Ohio", "Project Manager", 60);
    System.out.println("Manager: Name: " + m.name + ", Address: " + m.address +
        ", Salary in k: " + m.Salary + ", Bonus: " + m.calcBonus(m.Salary) +
        ", Performance Report: " + m.perfReport() +
        ", " + m.project("New Project"));

    Dev d = new Dev("Infosys Bandar", "Aligarh", "Developer", 70);
    System.out.println("Developer: Name: " + d.name + ", Address: " + d.address +
        ", Salary in k: " + d.Salary + ", Bonus: " + d.calcBonus(d.Salary) +
        ", Performance Report: " + d.perfReport() +
        ", " + d.project("Website Revamp"));

    Programmer p = new Programmer("TCS Bhediya", "Darbhanga", "Programmer", 80);
    System.out.println("Programmer: Name: " + p.name + ", Address: " + p.address +
        ", Salary in k: " + p.Salary + ", Bonus: " + p.calcBonus(p.Salary) +
        ", Performance Report: " + p.perfReport() +
        ", " + p.project("Mobile App"));
  }
}

class Manager extends Employee {
  Manager(String name, String address, String job, int Salary) {
    super(name, address, job, Salary);
  }

  @Override
  String perfReport() {
    return "Great";
  }
}

class Dev extends Employee {
  Dev(String name, String address, String job, int Salary) {
    super(name, address, job, Salary);
  }

  @Override
  String perfReport() {
    return "Great";
  }
}

class Programmer extends Employee {
  Programmer(String name, String address, String job, int Salary) {
    super(name, address, job, Salary);
  }

  @Override
  String perfReport() {
    return "Good";
  }
}
