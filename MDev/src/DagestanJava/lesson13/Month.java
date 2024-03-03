package DagestanJava.lesson13;

import static DagestanJava.lesson13.Month.monthIdentify;

public class Month {

    public static void monthIdentify (int month){
        switch (month){
            case 1: System.out.println("Это январь, в нем 31 день"); break;
            case 2: System.out.println("Это февраль, в нем 28 дней"); break;
            case 3: System.out.println("Это март, в нем 31 день"); break;
            case 4: System.out.println("Это апрель, в нем 30 дней"); break;
            case 5: System.out.println("Это май, в нем 31 день"); break;
            case 6: System.out.println("Это июнь, в нем 30 дней"); break;
            case 7: System.out.println("Это июнь, в нем 31 день"); break;
            case 8: System.out.println("Это июль, в нем 31 день"); break;
            default: System.out.println("Ввел какую-то хуйню, сотри!"); break;
        }
    }

}

class MonthTest{
    public static void main(String[] args) {
        monthIdentify(15);
    }
}
