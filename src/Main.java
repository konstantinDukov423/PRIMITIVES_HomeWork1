public class Main {
    public static void main(String[] args) {
        int buy = 200;  // Стоимость покупки
        int points20 = 20;  // За каждые 20 рублей начисляется 1 миля
        int points = buy / points20;  // Расчитаные бонусные мили
        System.out.println("Стоимость вашей покупки билета: " + buy);
        System.out.println("Зачисленно бонусных миль: " + points);

    }
}