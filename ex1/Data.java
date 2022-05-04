package ex1;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        if(this.isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("This date is invalid!");
            this.day = 0;
            this.month = 0;
            this.year = 0;
        }
    }

    public void print() {
        String dayStringified;
        String monthStringified;

        if(this.day < 10) {
            dayStringified = "0" + this.day;
        } else {
            dayStringified = "" + this.day;
        }

        if(this.month < 10) {
            monthStringified = "0" + this.month;
        } else {
            monthStringified = "" + this.month;
        }

        System.out.println(dayStringified + "/" + monthStringified + "/" + this.year);
    }

    private boolean isValidDate(int day, int month, int year) {
        int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};
        int[] monthWith30Days = {4, 6, 9, 11};
       
        if(month > 12 || month < 1) {
            return false;
        }

        for(int otherMonth : monthWith30Days) {
            if(month == otherMonth && (day > 30 || day < 1)) {
                return false;
            }
        }

        for(int otherMonth : monthsWith31Days) {
            if(month == otherMonth && (day > 31 || day < 1)) {
                return false;
            }
        }

        if(month == 2 && (day > 28 || day < 1)) {
            return false;
        }

        return true;
    } 
}