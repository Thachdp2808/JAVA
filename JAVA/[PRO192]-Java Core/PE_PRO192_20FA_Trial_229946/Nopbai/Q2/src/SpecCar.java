/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(super.getPrice() + 20);
    }

    public int getValue() {
        int newPrice = 0;
        if (type < 7) {
            newPrice = 10 + super.getPrice();
        } else {
            newPrice = 15 + super.getPrice();
        }
    return newPrice ;
}
@Override
        public String toString(){
    return super.getMaker() + ", " + super.getPrice() + ", " + type;
    }
}

