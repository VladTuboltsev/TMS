package pants;

public class PumaPants implements IPants{
    @Override
    public void pantsUp() {
        System.out.println("Одеть штаны Puma");
    }

    @Override
    public void pantsDown() {
        System.out.println("Снять штаны Puma");
    }
}
