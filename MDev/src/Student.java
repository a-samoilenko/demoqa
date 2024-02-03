public class Student {
    int studBiletNumber;
    String name;
    String surname;
    int year;
    double sredMath;
    double sredEcon;
    double sredLang;

}

class StudentTest{

    public static void main(String[] args) {
        Student One = new Student();
        Student Two = new Student();
        Student Three = new Student();
        One.sredEcon = 5;
        One.sredLang = 4;
        One.sredMath = 2.5;
        Two.sredEcon = 4;
        Two.sredLang = 3.3;
        Two.sredMath = 2.7;
        Three.sredEcon = 5;
        Three.sredLang = 5;
        Three.sredMath = 4;

        System.out.println("Средняя оценка первого студента: " + ((One.sredEcon+One.sredLang+One.sredMath)/3));
        System.out.println("Средняя оценка второго студента: " + ((Two.sredEcon+Two.sredLang+Two.sredMath)/3));
        System.out.println("Средняя оценка третьего студента: " + ((Three.sredEcon+Three.sredLang+Three.sredMath)/3));
    }
}
