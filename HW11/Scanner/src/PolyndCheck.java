public class PolyndCheck {
    public static boolean polyndCheck(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
