package DagestanJava;

public class OverloadingMethod {

    int sum(){
       return 0;
    }

    int sum(int a){
    return a;
    }

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

}

class TestOverloading {
    public static void main(String[] args) {
        OverloadingMethod ovm = new OverloadingMethod();
        System.out.println(ovm.sum(1,1, 1));
    }

}
