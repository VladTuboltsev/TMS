package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.hands.IHand;

public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делаю шаг вместе с Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }

}