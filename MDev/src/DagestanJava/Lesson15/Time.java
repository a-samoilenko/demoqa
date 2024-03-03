package DagestanJava.Lesson15;

public class Time {
    static void time(){

        int chas = 0;
        while (chas<=6){
            if(chas>1){break;}
            int min = -1;
            do {
                min++;
 //           for(int min = 0; min<=59; min++){
                if(min%10==0){continue;}
                int sec = 0;
                while (sec <=59){
                    if(sec*chas>min){break;}
                    System.out.println(chas+":"+min+":"+sec);
                    sec++;
                }
            }
            while (min<=59);
            chas++;
        }
    }
}

class TestTime{
    public static void main(String[] args) {
        Time.time();
    }
}
