/*По аналогии с первым задание делаем след. задание.
Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса.
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надетьдеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
*/


import jacket.NikeJacket;
import pants.PumaPants;
import shoes.NikeShoes;


public class Run {
    public static void main(String[] args) {
        Human ivan = new Human("Ваня", new NikeJacket(), new PumaPants(), new NikeShoes());
        ivan.dressUp();
        System.out.println();
        ivan.dressDown();
    }

}
