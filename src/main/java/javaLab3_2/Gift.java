package javaLab3_2;

import javaLab3_2.sweets.Sweets;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс, представляющий подарок, состоящий из набора сладостей
 * Позволяет наполнять его, рассчитывать общей вес и сумму
 * Выводит всю информациюю о подарке
 *
 * @author Anton Fedyaev
 * @version 1.0
 * @since 11.12.2025
 */
public class Gift {

    private List<Sweets> sweets = new ArrayList<>();


    /**
     * Добавляет сладость в подарок.
     *
     * @param sweet объект сладости
     */
    public void add(Sweets sweet) {
        sweets.add(sweet);
    }


    /**
     * @return общий вес сладостей в подарке
     */
    public double getTotalWeight() {
        return sweets.stream().mapToDouble(Sweets::getWeight).sum();
    }

    /**
     * @return общая стоимость всех сладостей
     */
    public double getTotalPrice() {
        return sweets.stream().mapToDouble(Sweets::getPrice).sum();
    }

    /**
     * Выводит в консоль информацию о подарке
     */
    public void printGiftInfo(){
        System.out.println("Содержимое подарка:");
        for (Sweets s : sweets) {
            System.out.println("-"+s);
        }
        System.out.println();
        System.out.println("Общий вес: "+getTotalWeight());
        System.out.println("Итоговая стоимость: "+getTotalPrice());
    }
}
