package DagestanJava;

public class Student {
    int studBiletNumber;
    String name;
    String surname;
    int year;
    double sredMath;
    double sredEcon;
    double sredLang;

    Student (int studBiletNumber, String name, String surname,int year,double sredMath,double sredEcon, double sredLang){
    this.studBiletNumber = studBiletNumber;
    this.name = name;
    this.surname = surname;
    this.year = year;
    this.sredMath = sredMath;
    this.sredEcon = sredEcon;
    this.sredLang = sredLang;
    }

    Student (int studBiletNumber, String name, String surname, int year){
    this (studBiletNumber, name, surname, year, 0.00 ,0.00, 0.00);
}

}

class StudentTest {
    void simpleCompare(Student st1, Student st2) {
        if (st1.studBiletNumber == st2.studBiletNumber) {
            System.out.println("Это два одинаковых студента");
        } else {
            System.out.println("Это разные студенты");
        }
    }

    void advancedCompare(Student st1, Student st2) {

        if (st1.studBiletNumber != st2.studBiletNumber) {
            if (st1.year != st2.year){
                if (st1.surname != st2.surname){
                    if (st1.name != st2.name){
                        System.out.println("Ебать, да у этих ребят ни одного сопадения! Это два разных студента по всем параметрам");
                    }
                    else {
                        System.out.println("Короче, у этих ребят совпадает только имя, остальные параметры разные");
                    }
                }
                else {
                        if (st1.name != st2.name){
                            System.out.println("Гля прикол, учатся однофамильцы, но имена разные и год рождения!");
                        }
                        else {
                            System.out.println("Вот это пизда, полные однофамильцы попались! Но год рождения разный.");
                        }
                    }
            }
            else {      //тут если года совпдают
                if (st1.surname != st2.surname){
                    if (st1.name != st2.name){
                        System.out.println("Ебать, да у этих ребят ничего не совпадает, только год рождения один");
                    }
                    else {
                        System.out.println("Короче, у этих ребят совпадает только имя и год рождения, остальные параметры разные");
                    }
                }
                else {
                    if (st1.name != st2.name){
                        System.out.println("Гля прикол, учатся однофамильцы, родились в один год, но имена разные!");
                    }
                    else {
                        System.out.println("Вот это пизда, полные однофамильцы попались! С одинаковым годом рождения! БИНГО!!!!");
                    }
                }
            }
        }

        else {
            System.out.println("Это два одинаковых студента");
        }
    }



    public static void main(String[] args) {
        Student student1 = new Student(1055, "Паша", "Романцов", 1982);
        Student student2 = new Student(1055, "Паша", "Романцов", 1982);
        StudentTest StudentTest = new StudentTest();
        StudentTest.advancedCompare(student1, student2);
    }
}
