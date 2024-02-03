public class BankAccount {
    int balanceScheta = 100;
    int popolnenieScheta(int summaUvelicheniya){
        balanceScheta += summaUvelicheniya;
    return balanceScheta;}

    int snyatieSoScheta(int summaUmensheniya){
        balanceScheta -= summaUmensheniya;
        return balanceScheta;}
}

class BankAccountNew {
    public static void main(String[] args) {
        BankAccount Console = new BankAccount();
        System.out.println("Сейчас мы увеличили счет на 50 рублей и сумма счета составила: " + Console.popolnenieScheta(50));
        System.out.println("Сейчас мы уменьшили счет на 50 рублей и сумма счета составила: " + Console.snyatieSoScheta(50));
    }

}