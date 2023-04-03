class StaticKeyword {
    //static variable
    static int salary = 10000;

    //non static instance variable
    int id;
    String name;

    //class constructor
    StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //static block
    static {
        System.out.println("--- Details Fetch ---");
    }

    //static method accessing static instance variable
    static void displaySalary(int sal) {
        System.out.println("Salary : " + sal);
    }

    //static method accessing static and non-static instance variables
    static void display(StaticKeyword obj) {
        System.out.println("ID : " + obj.id + "\n" + "Name : " + obj.name + "\n" + "Salary : " + salary);
    }

    //nested static class
    static class SalaryInsights {
        void fixedSalary() {
            System.out.println("Fixed Salary : " + 0.80 * salary);
        }

        void variableSalary() {
            System.out.println("Variable Salary : " + 0.20 * salary);
        }
    }
}
