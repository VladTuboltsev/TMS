
import java.util.HashMap;
import java.util.Map;

public class Market {
    private Map<Integer, Product> productMap = new HashMap<Integer, Product>();

    public void saveProduct (Product product) {
         if (!productMap.containsKey(product.getId())){
            productMap.putIfAbsent(product.getId(), new Product(product.getId(), product.getName(), product.getPrice()));
           } else {
             System.out.println("ID повторяется, введите другое значение");
          }
    }

    public void  getProductMap(){
        for(Map.Entry<Integer, Product> entry: productMap.entrySet())
            System.out.println("[Key = " + entry.getKey() +"] " + entry.getValue());
    }

   public void deleteProduct(int id){
        productMap.remove(id);
   }

   public void replaceProduct(Product product){
        productMap.replace(product.getId(), new Product(product.getId(), product.getName(), product.getPrice()));
   }

}
