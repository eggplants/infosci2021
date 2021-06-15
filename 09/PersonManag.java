/**
 * kadai 09-01
 *
 * @author haruna wataru
 * @version 2021-06-15
 */

class Employee
{
  private String name;
  private int id;
  private int salary;

  Employee(String n, int i, int s) {
    name = n;
    id = i;
    salary = s;
  }
  void print() {
    System.out.print(
        name +
    	"	ID:" + id +
    	"	Salary:" + salary);
  }
}

class Manager extends Employee
{
  private int managing;
  Manager(String n, int i, int s, int m){
    super(n, i, s);
    managing = m;
  }
  void print() {
    super.print();
    System.out.print("	Number of managing:" + managing);
  }
}

class PersonManag
{
  public static void main(String args[]) {
    Employee yamada = new Employee("YAMADA", 1, 100000);
    Employee tanaka = new Employee("TANAKA", 2, 120000);
    Employee suzuki = new Employee("SUZUKI", 3, 170000);
    Manager uchida = new Manager("UCHIDA", 4, 500000, 3);

    yamada.print();System.out.println();
    tanaka.print();System.out.println();
    suzuki.print();System.out.println();
    uchida.print();System.out.println();
  }
}
