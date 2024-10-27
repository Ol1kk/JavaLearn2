package org.example;

import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        PhoneStore phoneStore = new PhoneStore();


        int exit = 0;

        while (exit == 0) {
            System.out.println("Что вы хотите?");
            System.out.println("Введите <1> для создания нового товара");
            System.out.println("Введите <2> чтобы просмотреть все товары");
            System.out.println("Введите <3> чтобы удалить товар из магазина");
            System.out.println("Введите <4> чтобы показать товары, отсортированные по цене");
            System.out.println("Введите <5> чтобы показать товары, отсортированные по модели");
            System.out.println("Введите <6> чтобы найти товар по производителю");
            System.out.println("Введите <7> чтобы найти конкретный товар");
            System.out.println("Введите <ВЫХОД> если вы хотите завершить работу");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Введите производителя");
                String vendorInput = scanner.nextLine();
                System.out.println("Введите модель");
                String modelInput = scanner.nextLine();
                System.out.println("Введите цвет (не обязательно)");
                String colorInput = scanner.nextLine();
                System.out.println("Введите стоимость (с точкой)");
                double priceInput = Double.parseDouble(scanner.next());
                phoneStore.addNewPhone(vendorInput, modelInput, priceInput, colorInput);
            } else if (command.equals("3")) {
                System.out.println("Введите номер товара для удаления (можно посмотреть в общем списке товаров)");
                Integer keyInput = Integer.valueOf(scanner.nextLine());
                phoneStore.deleteObjects(keyInput);
            } else if (command.equals("2")) {
                phoneStore.showAllItems();

            } else if (command.equals("4")) {
                phoneStore.sortByPrice();

            } else if (command.equals("5")) {
                phoneStore.sortByModel();

            } else if (command.equals("6")) {
                System.out.println("Введите название производителя)");
                String vendorSearchInput = scanner.nextLine();
                phoneStore.searchBy(vendorSearchInput);

            } else if (command.equals("7")) {
                System.out.println("Введите название производителя)");
                String vendorSearchInput = scanner.nextLine();
                System.out.println("Введите название модели)");
                String modelSearchInput = scanner.nextLine();
                phoneStore.searchBy(vendorSearchInput, modelSearchInput);
            } else if (command.equals("ВЫХОД")) {
                System.out.println("До новых встреч!");
                exit++;
            }

        }
    }
}



