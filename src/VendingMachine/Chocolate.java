package VendingMachine;

import java.util.Calendar;

public class Chocolate extends Product {
    private double weightProduct = 0;
    private static final String nameClass;

    static {
        nameClass = "Шоколад";
    }

    public Chocolate(String brandProduct, double costProductPackage,
                     double weightProduct, int quantityProductPackage,
                     Calendar expirationDate) {

        super(nameClass, brandProduct, costProductPackage,
                quantityProductPackage, expirationDate);

        this.weightProduct = weightProduct;
    }

    @Override
    public String toString() {

        String[] strProduct = super.toString().split(" @ Стоимость");

        StringBuilder strOutData = new StringBuilder();

        strOutData.append(strProduct[0]);

        strOutData.append(" @ Вес продукта, Грамм:" + " " + weightProduct);

        strOutData.append(" @ Стоимость" + strProduct[1]);

        return strOutData.toString();
    }
}
