public class Main {
    public static void main(String[] args) {

        //static method accessing static instance variable - 'salary'
        int sal = StaticKeyword.salary;
        StaticKeyword.displaySalary(sal);

        //static variables are mutable and will be set for all objects of the class
        StaticKeyword.salary = 25000;
        StaticKeyword.displaySalary(StaticKeyword.salary);

        //static method accessing static variable - 'salary' and non-static instance variables - 'id' 'name'
        StaticKeyword obj = new StaticKeyword(101, "Shruti");
        StaticKeyword.display(obj);

        //nested static class
        StaticKeyword.SalaryInsights si = new StaticKeyword.SalaryInsights();
        si.fixedSalary();
        si.variableSalary();
    }
}