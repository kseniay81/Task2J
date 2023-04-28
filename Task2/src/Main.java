// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your co
public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int bonusRebirth = 100;
        int amountDepozit = 1200;
        int bonus;

        if (amountDepozit >= 1000) {
            bonus = amountDepozit / bonusRebirth;
        } else {
            bonus = 0;
        }
        int totalAccount = customerAccount + amountDepozit + bonus;
        System.out.println("Вы пополнили счет" + amountDepozit + "руб.");
        System.out.println("Бонус составил" + bonus + "руб");
        System.out.println("Ваш баланс" + totalAccount + "руб");
    }
}