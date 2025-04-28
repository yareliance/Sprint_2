package model;

import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food{
    public String colour;  // у яблок есть дополнительное поле - цвет яблок

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
