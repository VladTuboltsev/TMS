package Car;

public class run {
    public static void main(String[] args) throws StartException {
        carParametrs lamba = new carParametrs();
        lamba.setModel("lamba");
        lamba.setPrice(10000);
        lamba.setSpeed(320);
        lamba.displayInfo();
        lamba.carStart();

    }

}