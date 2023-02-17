package VendingMachine;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Product {
    protected String typeProduct = "";
    protected String brandProduct = "";
    protected double costProductPackage = 0;
    protected int quantityProductPackage = 0;
    protected Calendar expirationDate =
            new GregorianCalendar(0000, 00, 00);

    protected Product(String typeProduct, String brandProduct,
                      double costProductPackage, int quantityProductPackage,
                      Calendar expirationDate) {

        this.typeProduct = typeProduct;
        this.brandProduct = brandProduct;
        this.costProductPackage = costProductPackage;
        this.quantityProductPackage = quantityProductPackage;
        this.expirationDate = expirationDate;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public String getBrandProduct() {
        return brandProduct;
    }

    public int getQuantityProductPackage() {
        return quantityProductPackage;
    }

    public Product setQuantityProductPackage(int quantityProductPackage) {
        this.quantityProductPackage = quantityProductPackage;
        return null;
    }

    public double getCostProductPackage() {
        return costProductPackage;
    }

    @Override
    public boolean equals(Object obj) {
        Product forEquals = (Product) obj;

        boolean resultEquals =
                (typeProduct == forEquals.typeProduct &&
                        brandProduct == forEquals.brandProduct &&
                        costProductPackage == forEquals.costProductPackage);

        return resultEquals;
    }

    @Override
    public int hashCode() {
        return typeProduct.hashCode() +
                expirationDate.hashCode() +
                typeProduct.length() +
                brandProduct.length() +
                (int)costProductPackage +
                quantityProductPackage;
    }

    @Override
    public String toString() {

        StringBuilder strOutData = new StringBuilder();

        strOutData.append("@ Тип продукта:" + " " + typeProduct);
        strOutData.append(" @ Бренд продукта:" + " " + brandProduct);
        strOutData.append(" @ Стоимость одной упаковки продукта, Рублей:"
                + " " + costProductPackage);
        strOutData.append(" @ Количество упаковок продукта:"
                + " " + quantityProductPackage);
        strOutData.append(" @ Срок годности:" + " " + expirationDate.get(Calendar.DAY_OF_MONTH)
                + " " + expirationDate.get(Calendar.MONTH) + " " + expirationDate.get(Calendar.YEAR));

        return strOutData.toString();
    }
}