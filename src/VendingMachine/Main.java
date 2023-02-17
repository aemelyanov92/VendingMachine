package VendingMachine;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Product prSoda = new Soda
                ("Колокольчик", 123, 2,
                        new GregorianCalendar(2023, 02, 01),
                        500, "Пластиковая бутылка");

        Product prJuice = new Juice
                ("Добрый", 165, 5,
                        new GregorianCalendar(2023, 02, 01),
                        600, "Яблоко", "Тетропак");

        Product prChocolate = new Chocolate
                ("Аленка", 200, 100, 10,
                        new GregorianCalendar(2023, 02, 01));

        Product prPie = new Pie
                ("СуперБулка", 200, 14,
                        new GregorianCalendar(2023, 02, 01),
                        100, "Яблочное повидло");

        VendingMachine vendingMachineOne = new VendingMachine();

        vendingMachineOne.addProductVendingMachine(prSoda);
        vendingMachineOne.addProductVendingMachine(prJuice);
        vendingMachineOne.addProductVendingMachine(prChocolate);
        vendingMachineOne.addProductVendingMachine(prPie);

        System.out.println("\n" + "Содержимое торгового автомата после того как его зарядили:");
        System.out.println(vendingMachineOne);

        System.out.println("\n" + "Проводим поиск по типу товара:" + "\n");

        for (Product product : vendingMachineOne.findTypeProductInVM("Газировка")) {
            System.out.println(product);
        }

        System.out.println("\n" + "Проводим поиск по бренду товара:" + "\n");

        for (Product product : vendingMachineOne.findBrandProductInVM("Аленка")) {
            System.out.println(product);
        }

        System.out.println("\n" + "Проводим поиск по цене:" + "\n");

        for (Product product : vendingMachineOne.findCostProductVM(180)) {
            System.out.println(product);
        }

        System.out.println("\n" + "Проводим поиск по типу товара и цене:" + "\n");

        for (Product product : vendingMachineOne.findTypeProductAndCostProductInVM
                ("Шоколад",200)) {
            System.out.println(product);
        }

        System.out.println("\n" + "Выручка торгового автомата до продажи товара:");
        System.out.println(vendingMachineOne.getRevenue());

        System.out.println("\n" + "Содержимое торгового автомата до продажи товара:");
        System.out.println(vendingMachineOne);

        System.out.println("----------------------");


        if (vendingMachineOne.sellOneProductHuman("Газировка","Колокольчик")) {
            System.out.println("\n" + "Покупка произведена");
        }
        else {
            System.out.println("\n" + "Покупка НЕ произведена");
        }

        System.out.println("----------------------");

        if (vendingMachineOne.sellOneProductHuman("Сок","Добрый")) {
            System.out.println("\n" + "Покупка произведена");
        }
        else {
            System.out.println("\n" + "Покупка НЕ произведена");
        }

        System.out.println("----------------------");

        System.out.println("\n" + "Содержимое торгового автомата после продажи товара:");
        System.out.println(vendingMachineOne);

        System.out.println("\n" + "Выручка торгового автомата после продажи товара :");
        System.out.println(vendingMachineOne.getRevenue());
    }
}