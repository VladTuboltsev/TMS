import java.util.Scanner;

public class homeWork {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int positiveCount = 0;
            int negativeCount = 0;
            if(a>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }
            if(b>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }
            if(c>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }
            System.out.printf("Количество положительных: %d; Количество отричательных: %d;", positiveCount, negativeCount);
        }
    }

}
