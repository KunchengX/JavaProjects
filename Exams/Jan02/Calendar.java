package Exams.Jan02;

public class Calendar {
    public static void main(String[] args) {
        
    }

    public static int firstDayOfYear(int year) {
        return 1;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int result = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                result++;
            }
        }
        return result;
    }

    public static int dayOfWeek(int day, int month, int year) {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = 0;
        for (int i = 1; i < month; i++) {
            result += daysInMonth[i - 1];
        }
        result += day;

        if (isLeapYear(year) && month > 2) {
            result++;
        }

        return result % 7 + firstDayOfYear(year) - 1;
    }
}
