package by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price){
        this.price = price;
    }

    public SonyHand(){
    }

    public void upHand(){
        System.out.println("Говорит поднимаю руки за Sony");
    }

    public int getPrice(){
        return price;
    }
}
