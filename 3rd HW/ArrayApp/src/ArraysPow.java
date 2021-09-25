import java.util.Random;

public class ArraysPow {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int sum1 = 0;
        int[] mass = new int[5];
        int[] mass1 = new int[5];
        double pow = 0;
        double pow1 = 0;
        for (int i = 0; i < 5; i++) {   //1
            mass[i] = r.nextInt(15);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            mass1[i] = r.nextInt(15);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(mass1[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++) {
            sum = sum + mass[i];
        }
        pow = sum * 1.0 / 5;
        System.out.printf("Сумма 1-го: %d, среднее арифметическое: %.2f\n",sum,pow );
        for (int i = 0; i < 5; i++) {
            sum1 = sum1 + mass1[i];
        }
        pow1 = sum1 * 1.0 / 5;
        System.out.printf("Сумма 2-го: %d, среднее арифметическое: %.2f\n",sum1,pow1 );
        if(pow >pow1){
            System.out.println("Среднее арифметическое 1-го массива больше");
        } else if(pow<pow1){
            System.out.println("Среднее арифметическое 2-го массива больше");
        }else if(pow == pow1){
            System.out.println("Среднее арифметическое массивов равно");
        }

    }
}
