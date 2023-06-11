package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        short daysInMonth = 0;
        if (month >= 13) {
            System.out.println("wrong number!");
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31;
            } else if (month == 2) {
                daysInMonth = 28;
            } else {
                daysInMonth = 30;
            }
        }
        System.out.println(daysInMonth);
    }
}
