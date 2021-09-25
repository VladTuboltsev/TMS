package pants;

public class NikePants implements IPants{
    @Override
    public void pantsUp() {
        System.out.println("Одеть штаны Nike");
    }

    @Override
    public void pantsDown() {
        System.out.println("Снять штаны Nike");
    }
}
