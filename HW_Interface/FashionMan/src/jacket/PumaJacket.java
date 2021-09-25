package jacket;

public class PumaJacket implements IJacket{
    @Override
    public void jacketUp() {
        System.out.println("Одеть куртку Puma");
    }

    @Override
    public void jacketDown() {
        System.out.println("Снять куртку Puma");
    }
}
