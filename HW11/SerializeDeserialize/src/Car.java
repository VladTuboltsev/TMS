import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int price;
    private int speed;


    public Car(String brand, int price, int speed){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Марка: " + getBrand() + "\n"+
                "Скорость: " + getSpeed() + " км/ч\n" +
                "Цена: " + getPrice() + "$");
    }
}
