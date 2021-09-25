package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.heads.SamsungHead;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price){
        this.price=price;
    }

    public SamsungHand(){}

    @Override
    public void upHand() {
        System.out.println("Говорит поднимаю руки за Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
