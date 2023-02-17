package VendingMachine;

import java.util.Calendar;

public class Pie extends Product {

    private double weightProduct = 0;
    private String fillingPie = "";
    private static final String nameClass;

    static {
        nameClass = "Пирожок";
    }

    public Pie(String brandProduct, double costProductPackage,
               int quantityProductPackage, Calendar expirationDate,
               double weightProduct, String fillingPie) {

        super(nameClass, brandProduct, costProductPackage,
                quantityProductPackage, expirationDate);

        this.fillingPie = fillingPie;
        this.weightProduct = weightProduct;
    }

    @Override
    public String toString() {

        String[] strProduct = super.toString().split(" @ Стоимость");

        StringBuilder strOutData = new StringBuilder();

        strOutData.append(strProduct[0]);

        strOutData.append(" @ Начинка пирожка:" + " " + fillingPie);

        strOutData.append(" @ Вес продукта:" + " " + weightProduct);

        strOutData.append(" @ Стоимость" + strProduct[1]);

        return strOutData.toString();
    }
}
