package jacket;

public class NikeJacket implements IJacket{
    @Override
    public void jacketUp() {
        System.out.println("Одеть куртку Nike");
    }

    @Override
    public void jacketDown() {
        System.out.println("Снять куртку Nike");
    }
}
