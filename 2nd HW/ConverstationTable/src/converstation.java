public class converstation {
    public static void main(String[] args) {

        double inch = 2.54;
        double con;
        for (int i = 1; i < 21; i++) {

            con = i * inch;
            if (i == 1) {
                System.out.println("Дюймов:" + con + " в " + i + " сантиметре");
            }
            if (i > 1 && i < 21) {
                System.out.println("Дюймов:" + con + " в " + i + " сантиметрах");
            }
        }
    }

}
