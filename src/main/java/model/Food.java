package model;
// Абстрактный класс для всех продуктов:
public abstract class Food implements Discountable{

    // Поля доступны только потомкам:
    protected int amount; // количество продукта в килограммах (целое число)
    protected double price; // цена за единицу (вещественное число)
    protected boolean isVegetarian; // вегетарианский продукт или нет

    // Конструктор:
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount(){ // Получение количества продукта
        return amount;
    }
    public double getPrice(){ // Получение цены за единицу товара
        return price;
    }
    public boolean isVegetarian(){ // Получение информации вегетерианский продукт или нет
        return isVegetarian;
    }

   }
