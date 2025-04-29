package model;

import model.constants.Discount;

public class Meat extends Food {

    // Конструктор принимает два входных параметра — количество и цену:
    public Meat(int amount, double price) {
        super(amount, price, false); // и устанавливает, что мясо НЕ является вегетарианским продуктом
    }

    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }

}
