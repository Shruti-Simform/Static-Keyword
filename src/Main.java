public class Main {
    public static void main(String[] args) {
        int sal = StaticKeyword.salary;
        StaticKeyword.displaySalary(sal);

        StaticKeyword.salary = 25000;
        StaticKeyword.displaySalary(StaticKeyword.salary);

        StaticKeyword obj = new StaticKeyword(101, "Shruti");
        StaticKeyword.display(obj);

        StaticKeyword.SalaryInsights si = new StaticKeyword.SalaryInsights();
        si.fixedSalary();
        si.variableSalary();
    }
}