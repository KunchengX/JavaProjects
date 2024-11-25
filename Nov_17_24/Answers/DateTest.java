/**
 * The DateTest class contains the main method to test the Date class.
 * It creates a Date object and displays the date.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 24, 2021);
        date.displayDate();
    }
}

/**
 * The Date class represents a date with a month, day, and year.
 */
class Date {
    int month;
    int day;
    int year;

    /**
     * Constructs a Date object with the specified month, day, and year.
     *
     * @param month the month (1-12)
     * @param day the day (1-31)
     * @param year the year
     */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Sets the month.
     *
     * @param month the month to set (1-12)
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Returns the month.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the day.
     *
     * @param day the day to set (1-31)
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Returns the day.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the year.
     *
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Displays the date in the format MM/DD/YYYY.
     */
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
