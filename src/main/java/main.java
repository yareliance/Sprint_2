import model.*;
import model.constants.*; //импорт компанентов подпакета
import service.ShoppingCart;

public class main {
    public static void main(String[] args) {
        // Создание объектов:
        Food meat = new Meat(5, 100); // Мясо в количестве 5 кг по цене 100 рублей за кг
        Food redApples = new Apple(10, 50, Colour.RED); // Яблоки красные в количестве 10 кг по цене 50 рублей;
        Food greenApples = new Apple(8, 60, Colour.GREEN); // Яблоки зелёные в количестве 8 кг по цене 60 рублей.

        //Массив продуктов:
        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products); //Объект корзина

        System.out.println("Общая сумма товаров без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getSumWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getSumVeganWithoutDiscount());
    }
}
