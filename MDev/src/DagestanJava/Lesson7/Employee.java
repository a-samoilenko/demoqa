package DagestanJava.Lesson7;

public class Employee {
    private int salary;
    public String surname;
    int id;

    public void method1(){
        System.out.println("Переменная Salary равна:" + salary);
    }
    public void method2(){
        System.out.println("Переменная Surname равна:" + surname);
    }
    public void method3(){
        System.out.println("Переменная ID равна:" + id);
    }

    public Employee(int salary, String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
    Employee(String surname, int id, int salary){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    private Employee(int id, int salary, String surname){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

}
