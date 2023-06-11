package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxPercent;
        double salaryTax;

        if (salary == 0) {
            System.out.println("wrong input!");
        } else {
            if (salary <= 10000) {
                taxPercent = 15.0;
                salaryTax = salary * (taxPercent / 100);
                System.out.println(salary - salaryTax);
            } else if (salary > 10000 && salary <= 20000) {
                taxPercent = 18.0;
                salaryTax = salary * (taxPercent / 100);
                System.out.println(salary - salaryTax);
            } else {
                taxPercent = 20.0;
                salaryTax = salary * (taxPercent / 100);
                System.out.println(salary - salaryTax);
            }
        }
    }
}
