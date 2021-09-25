package shoes;

public class PumaShoes implements IShoes{
    @Override
    public void shoesUp() {
        System.out.println("Одеть обувь Puma");
    }

    @Override
    public void shoesDown() {
        System.out.println("Снять обувь Puma");
    }
}
