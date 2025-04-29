package service;

import model.*; // Импорт всех классов из пакета model

//Класс для корзины покупок:
public class ShoppingCart {

    Food[] foods; // Массив продуктов в корзине

    public ShoppingCart(Food[] foods){ // Конструктор копирования массива

        // this.products = products;  - так лучше не писать, т.к. на массив обычно ссылаются и чтобы не стереть значение
        // Создаем новый массив, чтобы избежать проблем с изменением оригинального
        this.foods = new Food[foods.length];
        for (int i = 0; i < foods.length; i++){
            this.foods[i] = foods[i];
        }
    }

    public double getSumWithoutDiscount(){ // Метод для получения общей суммы товаров в корзине БЕЗ скидки
        double sum = 0.0;
        for (Food food : foods) {
            sum += food.getPrice() * (double) food.getAmount(); // Умножаем цену на количество и приводим количество к double
        }
        return sum;
    }

    public double getSumWithDiscount(){ // Метода для получения общей суммы товаров СО скидкой
        double sum = 0.0;
        for (Food food : foods) {
            // Формула расчета со скидкой: цена * количество * (100 - скидка)%
            sum += food.getPrice() * (double) food.getAmount() * (100.00 - food.getDiscount()) / 100.00;
        }
        return sum;
    }
    public double getSumVeganWithoutDiscount(){ // Метод для получения общей суммы вегетерианских товаров БЕЗ скидки
        double sum = 0.0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * (double) food.getAmount();
            }
        }
        return sum;
    }

}





