package model;

import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food{

    // у яблок есть дополнительное поле - цвет яблок
    private String colour;  // модификатор доступа минимальный, тк используется только в этом классе

    // Конструктор принимает три входных параметра — количество, цену, цвет:
    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // и устанавливает, что яблоки - это вегетарианский продукт
        this.colour = colour; // параметр текущего экземпляра яблок, а super смотрит параметры в родительском классе
    }

    @Override
    public double getDiscount(){

        if(Colour.RED.equals(colour) ){ // сравнение цвета с красным
            return Discount.DISCOUNT_60;
        } else {
            return Discount.NO_DISCOUNT;
        }
    }

}
