import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        addSweets();
    }
    public static void addSweets() {
        boolean flag = false;
        int sumPrice =0, sumWeight =0;

        ArrayList <Sweets> sweets = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите соответствующую цифру, где: ");
        System.out.println("'1' - Шоколад \"Аленка\"");
        System.out.println("'2' - Шоколад \"Alpen Gold\"");
        System.out.println("'3' - Мармелад \"Haribo\"");
        System.out.println("'4' - Конфеты \"Степ\"");
        System.out.println("'5' - Конфеты \"Twix\"");
        System.out.println("'6' - Конфеты \"Mars\"");
        System.out.println("'0' - Закончить");

        while (!flag) {
            int choice = in.nextInt();

            int quantity = 0;// in.nextInt();
            switch (choice) {
                case (1):
                    Chocolate chAlenka = new Chocolate("Шоколад \"Аленка\"", 300, 70, "Апельсин");
                    sweets.add(chAlenka);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chAlenka.getPrice();
                    sumWeight += quantity * chAlenka.getWeight();
                    System.out.println("Шоколад \"Аленка\" добавлен в подарок");
                    break;
                case (2):
                    Chocolate chAlpG = new Chocolate("Шоколад \"Alpen Gold\"", 400, 100, "Лесной орех");
                    sweets.add(chAlpG);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chAlpG.getPrice();
                    sumWeight += quantity * chAlpG.getWeight();
                    System.out.println("Шоколад \"Alpen Gold\" добавлен в подарок");
                    break;
                case (3):
                    Jellybean jellyHar = new Jellybean("Мармелад \"Haribo\"", 250, 85, "Желтый");
                    sweets.add(jellyHar);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * jellyHar.getPrice();
                    sumWeight += quantity * jellyHar.getWeight();
                    System.out.println("Мармелад \"Haribo\" добавлен в подарок");
                    break;
                case (4):
                    Candy candyStep = new Candy ("Конфеты \"Степ\"", 100, 150, "С орехом");
                    sweets.add(candyStep);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyStep.getPrice();
                    sumWeight += quantity * candyStep.getWeight();
                    System.out.println("Конфеты \"Степ\" добавлен в подарок");
                    break;
                case (5):
                    Candy candyTwix = new Candy ("Конфеты \"Twix\"", 120, 300, "2 палочки");
                    sweets.add(candyTwix);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyTwix.getPrice();
                    sumWeight += quantity * candyTwix.getWeight();
                    System.out.println("Конфеты \"Twix\" добавлен в подарок");
                    break;
                case (6):
                    Candy candyMars = new Candy ("Конфеты \"Mars\"", 400, 550, "темный");
                    sweets.add(candyMars);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyMars.getPrice();
                    sumWeight += quantity * candyMars.getWeight();
                    System.out.println("Конфеты \"Mars\" добавлен в подарок");
                    break;
                case (0): flag = true;
                    break;
            }
        }

        int i = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet:sweets) {
            i++;
            System.out.println(i + ". " + sweet.getName() +" " + sweet.getWeight() + "гр " + sweet.getPrice() + " руб");
        }
        System.out.println(String.format("\nВес подарка: %s гр.\nОбщая цена подарка: %s руб.", sumWeight, sumPrice));

    }
}

