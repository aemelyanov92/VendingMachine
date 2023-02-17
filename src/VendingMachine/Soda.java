package VendingMachine;

import java.util.Calendar;

public class Soda extends Product {

    private int packingVolumeProduct = 0;
    private String typePackaging = "";
    private static final String nameClass;

    static {
        nameClass = "Газировка";
    }

    public Soda(String brandProduct, double costProductPackage,
                int quantityProductPackage, Calendar expirationDate,
                int packingVolumeProduct, String typePackaging) {

        super(nameClass, brandProduct, costProductPackage,
                quantityProductPackage, expirationDate);

        this.packingVolumeProduct = packingVolumeProduct;
        this.typePackaging = typePackaging;
    }

    @Override
    public String toString() {

        String priznak = " @ Стоимость";

        String[] strProduct = super.toString().split(priznak);

        StringBuilder strOutData = new StringBuilder();

        strOutData.append(strProduct[0]);
        strOutData.append(" @ Объем упаковки, Миллитров:" + " "
                + packingVolumeProduct);
        strOutData.append(" @ Тип упаковки:" + " " + typePackaging);
        strOutData.append(priznak +  strProduct[1]);

        return strOutData.toString();
    }
}
