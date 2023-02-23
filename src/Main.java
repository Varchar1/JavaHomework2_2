public class Main {
    public static void main(String[] args) {
        int starting = 100;
        int replenishment = 1500;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int sum = starting + replenishment + bonus;

        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговый счет: " + sum);
    }
}
