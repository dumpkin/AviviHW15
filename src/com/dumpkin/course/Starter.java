package com.dumpkin.course;

import java.util.*;

public class Starter {

    public static void launch() {
        ConsoleInput input = new ConsoleInput();
        ArrayList<Commodity> article = new ArrayList<>();

        article.add(new Commodity("Nestle", "food", "nescafe", "12/10/2020"));
        article.add(new Commodity("Uriafarm", "pharma", "demidrol", "1/06/2025"));
        article.add(new Commodity("Avivi", "course", "Java", "25/07/2019"));

        Scanner key = new Scanner(System.in);

        System.out.println("(1)показати перелік товарів (2)додати товар (3)видалити товар \n" +
                "(4)сортування за продуктом(5)сортування за типом (6)сортування за брендом");
        while (key.hasNext()) {
            switch (key.nextLine()) {

                case "1":
                    System.out.println("\n\nсписок ");
                    viewList(article);
                    break;
                case "2":
                    addElementTo(article);
                    break;
                case "3":
                    removeElementFrom(article);
                    break;
                case "4":
                    article.sort(new CommodityNameComparator());
                    System.out.println("відсортовано");
                    break;
                case "5":
                    article.sort(new CommodityTypeComparator());
                    System.out.println("відсортовано");
                    break;
                case "6":
                    article.sort(new CommodityBrandComparator());
                    System.out.println("відсортовано");
                    break;
                default:
                    System.out.println("неправильний параметр. спробуйте ще раз.");
                case "exit":
                    return;
            }

        }


    }


    public static void viewList(ArrayList<Commodity> inerlist) {
        int num = 1;
        Iterator<Commodity> iter = inerlist.iterator();

        while (iter.hasNext()) {
            System.out.println("Позиція:" + num + ' ' + iter.next());
            num++;
        }
    }

    public static void addElementTo(ArrayList<Commodity> elements) {
        /**
         * вводимо данні елементу
         * */


        ConsoleInput input = new ConsoleInput();

        Commodity element = new Commodity(input.inputString("Бренд"), input.inputString("Назва продукту"),
                input.inputString("тип"), input.inputString("кінцевий термін придатності"));
        elements.add(element);

        System.out.println("_______________________________\n");

    }

    public static void removeElementFrom(ArrayList<Commodity> elements) {
        /**
         * Пошук студента по імені та вдалення його
         * */
        ConsoleInput input = new ConsoleInput();
        String SearchByName = input.inputString("Ведіть параметр для пошуку: ");
        // ListIterator<Commodity> commodityListIterator = elements.listIterator();

        for (Iterator<Commodity> it = elements.iterator(); it.hasNext(); ) {
            Commodity forDel = it.next();
            String Word = forDel.getExpireDate();
            if (SearchByName.equals(Word)) {
                System.out.println("товар " + Word + " видалений");
                it.remove();
            }
        }
    }

}
