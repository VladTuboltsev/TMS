package Car;

public class carParametrs {
    private int speed;
    private int price;
    private String model;

    public carParametrs(int speed, int price, String model){
        this.speed = speed;
        this.price = price;
        this.model = model;
    }

    public carParametrs() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    void displayInfo(){
        System.out.printf("Скорость:%s\nЦена:%s\nМодель:%s\n", this.speed, this.price, this.model);
    }

    public void carStart() throws StartException {
        int a = 0;
        int b = 20;
        int i =a + (int) (Math.random() * b);
        if (i % 2 == 0){
            System.out.println(i);
            throw new StartException("Машинка то вялая");
        } else {
            System.out.println(getModel()+" зaвелась!!!");
        }

    }
}
