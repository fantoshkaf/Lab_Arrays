package javaLab3_2;

import javaLab3_2.sweets.Candy;
import javaLab3_2.sweets.Jellybean;

import java.util.Random;

/**
 * Программа собирает подарок из сладостей, ищет общий вес и итоговую стоимость
 * Затем выводит общую информацию о содержимом
 *
 * @author Anton Fedyaev
 * @version 1.0
 * @since 11.12.2025
 */
public class Main {
    public static void main(String[] args) {

        //создаем объект подарка
        Gift gift = new Gift();

        //создание сладостей для заполнения
        Candy chocolateCandy = new Candy("Шоколадная конфета", 10, 15, "Шоколад");
        Candy marzipanCandy = new Candy("Конфета с марципаном", 15, 20, "Марципан");
        Candy bananaCandy = new Candy("Конфета с бананом", 10, 20, "Банан");
        Jellybean redJellybean = new Jellybean("Мармеладные червячки", 100, 60, "Красные");
        Jellybean yellowJellybean = new Jellybean("Мармеладные мишки", 70, 80, "Желтые");

        //наполнение подарка сладостями
        gift.add(chocolateCandy);
        gift.add(chocolateCandy);
        gift.add(chocolateCandy);
        gift.add(marzipanCandy);
        gift.add(marzipanCandy);
        gift.add(bananaCandy);
        gift.add(redJellybean);
        gift.add(yellowJellybean);
        gift.add(yellowJellybean);

        //вывод всей информации о подарке
        gift.printGiftInfo();

    }
}
