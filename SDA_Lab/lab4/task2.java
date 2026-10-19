package lab4;

public class task2 {

    class Employee {
        public String name;
        public double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        double calculateSalary() {
            return salary;
        }

    }

    class Manager extends Employee {

        Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        public double bonus;

        double calculateSalary() {
            return bonus + salary;
        }
    }

    class Developer extends Employee {
        Developer(String name, double salary, int overtimeHours) {
            super(name, salary);
            this.overtimeHours = overtimeHours;
        }

        public int overtimeHours;

        double calculateSalary() {
            return salary + (overtimeHours * 500);
        }

    }

    void main(String[] argv) {
        Employee[] employees = new Employee[4];

        // Manager[] managers = new Manager[2];
        // managers[0] = new Manager("Haad", 5000, 1000);
        // managers[1] = new Manager("Ahmed", 6000, 1500);
        // Developer[] developers = new Developer[2];
        // developers[0] = new Developer("Ali", 3000, 5);
        // developers[1] = new Developer("Usman", 4000, 3);

        employees[0] = new Manager("Haad", 5000, 1000);
        employees[1] = new Developer("Ali", 3000, 5);
        employees[2] = new Manager("Ahmed", 6000, 1500);
        employees[3] = new Developer("Usman", 4000, 3);

        for (int i = 0; i < 4; i++) {
            System.out.println(employees[i].calculateSalary());
        }

    }
}
