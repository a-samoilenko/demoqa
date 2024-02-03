public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println(getDay(31, 12, 2000));

    }

    public static String getDay(int day, int month, int year) {
        if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            day = 1;
            month = month + 1;
        }
        else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month = month + 1;
        }
        else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year = year + 1;
        }
        else if (day == 28 && month == 2) {
            day = 1;
            month = month + 1;
        }
        else {
            day = day + 1;
        }
        return (day + "." + month + "." + year);
    }


}
