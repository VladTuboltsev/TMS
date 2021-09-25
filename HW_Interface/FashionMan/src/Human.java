import jacket.IJacket;
import pants.IPants;
import shoes.IShoes;

import javax.lang.model.element.Name;


public class Human implements IHuman{
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }

    public Human(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    @Override
    public void dressUp() {
        System.out.println(getName()+" ");
        jacket.jacketUp();
        pants.pantsUp();
        shoes.shoesUp();
    }

    @Override
    public void dressDown() {
        jacket.jacketDown();
        pants.pantsDown();
        shoes.shoesDown();
    }
}
