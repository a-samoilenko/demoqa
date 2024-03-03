package DagestanJava.Lesson14;

import static DagestanJava.Lesson14.Time.time;

public class Time {
    static void time(){
        Outer:
        for(int chas = 0; chas <=6; chas++){
            if(chas>1){break;}
            Middle:
            for(int min = 0; min<=59; min++){
                if(min%10==0){continue;}
                Inner:
                for(int sec = 0; sec <=59; sec++){
                    if(sec*chas>min){break;}
                    System.out.println(chas+":"+min+":"+sec);
                }
            }

        }
    }
}

class TestTime{
    public static void main(String[] args) {
        time();
    }
}
