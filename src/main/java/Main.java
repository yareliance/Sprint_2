import model.*;
import model.constants.*; //импорт компанентов подпакета
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создание объектов:
        Food meat = new Meat(5, 100); // Мясо в количестве 5 кг по цене 100 рублей за кг
        Food redApples = new Apple(10, 50, Colour.RED); // Яблоки красные в количестве 10 кг по цене 50 рублей;
        Food greenApples = new Apple(8, 60, Colour.GREEN); // Яблоки зелёные в количестве 8 кг по цене 60 рублей.

        //Массив продуктов:
        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products); //Объект корзина

        //Вариант 1 сборки строк:
        //System.out.println("Общая сумма товаров без скидки: " + cart.getSumWithoutDiscount());
        //System.out.println("Общая сумма товаров со скидкой: " + cart.getSumWithDiscount());
        //System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getSumVeganWithoutDiscount());

        //Вариант 2 сборки строк:
        // ANSI коды для цветов
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m"; // сброс настроек форматирования последующего текста

        // Вывод заголовка раздела
        System.out.println("\u001B[1m" + "\u001B[4m" + "ИТОГО В КОРЗИНЕ:" + RESET); // \u001B[1m - жирный шрифт, \u001B[4m - подчеркивание

        // %s - вывод строковых значений и количество символов для выравнивания
        // %.2f - вывод чисел с двумя знаками после запятой
        // %n- перенос строки на новую
        System.out.printf("%-31s: %s%.2f%s рублей%n", "Общая сумма товаров без скидки", GREEN, cart.getSumWithoutDiscount(), RESET);
        System.out.printf("%-31s: %s%.2f%s рублей%n", "Общая сумма товаров со скидкой", GREEN, cart.getSumWithDiscount(), RESET);
        System.out.printf("%-31s: %s%.2f%s рублей (без скидки)%n", "Сумма вегетарианских продуктов", GREEN, cart.getSumVeganWithoutDiscount(), RESET);
    }
}
