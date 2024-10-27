package org.example;

import java.util.*;

public class PhoneStore {


    List<Phone> list = new ArrayList<>();


    public void addNewPhone(String vendor, String model, double price, String color) {

        Phone newPhone = new Phone(vendor, model, price, color);

        boolean unique = true;

        for (Phone p : list) {
            if (p.model.equals(newPhone.model) && Math.abs(p.price - newPhone.price) < 0.001) {
                unique = false;
                break;
            }
        }

        if (unique) {
            list.add(newPhone);
            System.out.println("Товар добавлен");
        } else {
            System.out.println("Данный товар уже есть в магазине!");
        }
    }

    public void showAllItems() {
        for (Phone phone : list) {
            System.out.println(phone);
        }

    }

    public void deleteObjects(Integer keyInput) {
        for (Phone phone : list) {
            if (phone.getId() == keyInput) {
                list.remove(phone);
                System.out.println("Товар успешно удален!");
                return;
            } else {
                System.out.println("Товар не найден. Уточните номер товара в общем списке");
            }
        }
    }


    public void sortByModel() {
        Collections.sort(list);
        showAllItems();
    }

    public void sortByPrice() {
        Collections.sort(list, Comparator.comparing(Phone::getPrice));
        showAllItems();
    }

    public void searchBy(String vendorInput) {
        boolean found = false;
        for (Phone phone : list) {
            if (phone.getVendor().equalsIgnoreCase(vendorInput)) {
                System.out.println(phone);
                found = true;
            }
        }

            if (!found) {
                System.out.println("Товар не найден!");
            }
        }


    public void searchBy(String vendorInput, String modelInput) {
        boolean found = false;
        for (Phone phone : list) {
            if (phone.getVendor().equalsIgnoreCase(vendorInput) && phone.getModel().equalsIgnoreCase(modelInput) ) {
                System.out.println(phone);
                found = true;
            }
            }
            if (!found) {
                System.out.println("Товар не найден!");
            }
        }
    }


