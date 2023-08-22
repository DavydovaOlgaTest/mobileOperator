public class Main {
    public static void main(String[] args) {
        int InitialBalance = 100;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        // int bonus = addend > 1000 ? addend /100 : 0;

        int finalBalance = InitialBalance + addend + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
