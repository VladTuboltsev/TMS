package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;
import by.teachmeskills.robot.IRobot;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot bender = new Robot(new SamsungHead(25), new ToshibaHand(28) ,new SonyLeg(32));
        System.out.println("\nРобот Бендер:");
        bender.action();
        Robot vision = new Robot(new SonyHead(12), new SamsungHand(43) ,new ToshibaLeg(332));
        System.out.println("\nРобот Вижн:");
        vision.action();
        Robot walle = new Robot(new ToshibaHead(234), new SonyHand(215) ,new SamsungLeg(3352));
        System.out.println("\nРобот Валл-е:");
        walle.action();

        if(bender.getPrice() > walle.getPrice() && bender.getPrice() > vision.getPrice()){
            System.out.println("\nБендер самый дорогой робот на этой вечеринке: " + bender.getPrice() + " тенге.");
        }else if (walle.getPrice() > bender.getPrice() && walle.getPrice() > vision.getPrice()){
            System.out.println("\nВалл-е самый дорогой робот на этой вечеринке: "+ walle.getPrice() + " тенге.");
        }else if (vision.getPrice() > bender.getPrice() && vision.getPrice() > walle.getPrice()){
            System.out.println("\nВижн самый дорогой робот на этой вечеринке: " + vision.getPrice()+ " тенге.");
        }
    }
}
