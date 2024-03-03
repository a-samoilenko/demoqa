package DagestanJava.Lesson9.Zadanie1;

public class Supaproga {
    int a = 10;

    Supaproga() {}
    Supaproga(int a) {
        this.a = a;
    }
}



class SupaprogaTest{
    public static void main(String[] args) {
        Supaproga sp1 = new Supaproga();
        Supaproga sp2 = new Supaproga();
        sp1 = new Supaproga(20);

        System.out.println(sp2.a);
        System.out.println(sp1.a);



    }
}