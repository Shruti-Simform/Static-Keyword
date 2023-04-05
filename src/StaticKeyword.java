class StaticKeyword {
    static int salary = 10000;
    int id;
    String name;

    StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        System.out.println("--- Details Fetch ---");
    }

    static void displaySalary(int sal) {
        System.out.println("Salary : " + sal);
    }

    static void display(StaticKeyword obj) {
        System.out.println("ID : " + obj.id + "\n" + "Name : " + obj.name + "\n" + "Salary : " + salary);
    }

    static class SalaryInsights {
        void fixedSalary() {
            System.out.println("Fixed Salary : " + 0.80 * salary);
        }

        void variableSalary() {
            System.out.println("Variable Salary : " + 0.20 * salary);
        }
    }
}
