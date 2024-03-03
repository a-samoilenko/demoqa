package DagestanJava.Lesson8.zadanie1;

public class First {

    static int firstMethod (int ch1, int ch2, int ch3){
        return ch1*ch2*ch3;
    }

    static void secondMethod (double ch1, double ch2){
    System.out.println("Результат деления первого часла на второе равен: " + (ch1/ch2));
    }
}

class TestFirst{
    public static void main(String[] args) {
        System.out.println(First.firstMethod(3,3,3));
        System.out.println(First.firstMethod(2,2,2));
        First.secondMethod(10.4,22.2);
        First.secondMethod(22.44,2.0);
    }
}

