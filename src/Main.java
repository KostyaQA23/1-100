public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1100;
        int bonus = 0;

        if (deposit > 1000) {
            bonus = deposit / 100;
            account = account + deposit + bonus;
            System.out.println("Счет:" + account + " Руб. Бонус:" + bonus + " Руб.");

        } else {
            account = account + deposit;
            System.out.println("Счет:" + account + " Руб. Бонус:" + bonus + " Руб.");
        }
    }
}