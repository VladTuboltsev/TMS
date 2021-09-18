package personal_computer;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Random r = new Random();


        var com = new Configuration();
        com.setProcessor("IntelCore");
        com.setRam("Asus");
        com.setHdd("Seagate");
        com.setCicle(4);
        com.displayInfo();

            System.out.println("Включение. Введите число от 0 до 1: ");
            int randomXo = r.nextInt(2);
            System.out.println(randomXo);
            int xo = sc.nextInt();
            do {
                if (xo != randomXo) {
                    System.out.println("Компьютер сгорел Х_Х");
                    System.exit(1);
                } else {
                    com.setCicle(com.getCicle()-1);
                    System.out.println("Включение");
                }
                    int randomXO1 = r.nextInt(2);
                    System.out.println("Выключение. Введите число от 0 до 1: ");
                    System.out.println(randomXO1);
                    int xo1 = sc.nextInt();
                    if(xo1 != randomXO1){
                        System.out.println("Компьютер сгорел Х_Х");
                    } else {
                        com.setCicle(com.getCicle()-1);
                        System.out.println("Выключение");
                    }


            }while (com.getCicle()>=0);
        System.out.println("Ресурс выробатан");
    }
}
