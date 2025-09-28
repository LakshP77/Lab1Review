// Instance variables are set to private to protect the infomation inside the class, and that way only getters and setters can change values
// Private variables are only accessible inside the same class they were declared

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        validateYear(year);
        validateMonth(month);
        validateDay(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1975;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public void setDay(int day) {
        validateDay(day, this.month, this.year);
        this.day = day;
    }

    public void setMonth(int month) {
        validateMonth(month);
        validateDay(this.day, month, this.year); 
        this.month = month;
    }

    public void setYear(int year) {
        validateYear(year);
        validateDay(this.day, this.month, year); 
        this.year = year;
    }

    // Validation methods
    private void validateMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
    }

    private void validateYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive (CE/AD).");
        }
    }

    private void validateDay(int day, int month, int year) {
        int[] daysInMonth = {
            31, // January
            isLeapYear(year) ? 29 : 28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
        };

        if (day < 1 || day > daysInMonth[month - 1]) {
            throw new IllegalArgumentException("Invalid day for given month/year.");
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // toString method
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
