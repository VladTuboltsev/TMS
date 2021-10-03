
public class Main {
    public static void main(String[] args) {
        var mark = new Market();
        mark.saveProduct(new Product(1,"Хлеб",10 ));
        mark.saveProduct(new Product(2,"Молоко",14 ));
        mark.saveProduct(new Product(3,"Капуста",3 ));
        mark.saveProduct(new Product(4,"Гречка",1 ));
        mark.saveProduct(new Product(5,"Масло",65 ));
        mark.saveProduct(new Product(6,"Сыр",145 ));
        mark.getProductMap();
        System.out.println("---------------------");
        mark.deleteProduct(2);
        mark.getProductMap();
        System.out.println("---------------------");
        mark.replaceProduct(new Product(3,"Огурцы",21 ));
        mark.getProductMap();
        System.out.println("---------------------");
    }
}
