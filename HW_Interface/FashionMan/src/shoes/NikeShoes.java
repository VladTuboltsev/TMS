package shoes;

public class NikeShoes implements IShoes{
    @Override
    public void shoesUp() {
        System.out.println("Одеть обувь Nike");
    }

    @Override
    public void shoesDown() {
        System.out.println("Снять обувь Nike");
    }
}
