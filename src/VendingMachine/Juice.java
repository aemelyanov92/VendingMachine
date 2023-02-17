package VendingMachine;

import java.util.Calendar;

public class Juice extends Product {

    private int packingVolumeProduct = 0;
    private String typePackaging = "";
    private String tasteJuice = "";
    private static final String nameClass;

    static {
        nameClass = "Сок";
    }

    public Juice(String brandProduct, double costProductPackage,
                 int quantityProductPackage, Calendar expirationDate,
                 int packingVolumeProduct, String tasteJuice,
                 String typePackaging) {

        super(nameClass, brandProduct, costProductPackage, quantityProductPackage, expirationDate);
        this.packingVolumeProduct = packingVolumeProduct;
        this.tasteJuice = tasteJuice;
        this.typePackaging = typePackaging;
    }

    @Override
    public String toString() {

        String[] strProduct = super.toString().split(" @ Стоимость ");

        StringBuilder strOutData = new StringBuilder();

        strOutData.append(strProduct[0]);
        strOutData.append(" @ Объем упаковки, Миллилитров:" + " " + packingVolumeProduct);
        strOutData.append(" @ Тип упаковки:" + " " + typePackaging);
        strOutData.append(" @ Вкус:" + " " + tasteJuice);
        strOutData.append(" @ Стоимость" + " " +  strProduct[1]);

        return strOutData.toString();
    }
}
