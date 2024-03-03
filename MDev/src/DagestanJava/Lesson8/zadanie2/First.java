package DagestanJava.Lesson8.zadanie2;

public class First {
    static final double pi = 3.14;

    double ploshadKruga(double radius){
    double ploshadKruga = radius*pi*radius;
    System.out.println("Площадь круга равна: " + ploshadKruga);
    return ploshadKruga;
    }
    static double dlinaOkrugnosti(double radius){
        double dlinaOkrugnosti = 2*pi*radius;
        System.out.println("Длина окружности равна: " + dlinaOkrugnosti);
        return dlinaOkrugnosti;
    }

    void supaMethod(double radius){
    System.out.println("Радиус равен: "+ radius);
    ploshadKruga(radius);
    dlinaOkrugnosti(radius);
    }

}

class TestFirst{
    public static void main(String[] args) {
        First pk = new First();
        pk.supaMethod(2.5);

//        First.dlinaOkrugnosti(2.5);
    }
}