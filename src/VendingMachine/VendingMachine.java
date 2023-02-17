package VendingMachine;

import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private List<Product> productsForSale = new ArrayList<Product>();
    private double revenueVendingMachine = 0;

    public void addProductVendingMachine(Product inputProduct) {
        this.productsForSale.add(inputProduct);
    }

    public List<Product> findTypeProductInVM(String typeProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getTypeProduct().contains(typeProduct)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findBrandProductInVM(String brandProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getBrandProduct().contains(brandProduct)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findCostProductVM(double reasonablePrice) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if (product.getCostProductPackage() <= reasonablePrice) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public List<Product> findTypeProductAndCostProductInVM(String typeProduct,
                                                           double reasonablePrice) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if ((product.getTypeProduct().contains(typeProduct)) &&
                    (product.getCostProductPackage() <= reasonablePrice)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    private List<Product> findTypeProductAndBrandProductInVM(String typeProduct,
                                                             String brandProduct) {

        List<Product> foundProduct = new ArrayList<>();

        for (Product product : productsForSale) {
            if ((product.getTypeProduct().contains(typeProduct)) &&
                    (product.getBrandProduct().contains(brandProduct))) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    private int searchIndexInListForSellOneProductHuman(List<Product> listForSearch) {

        int count = 0;

        for(Product product : productsForSale) {
            if (product == listForSearch.get(0)) {
                return count;
            }
            count ++;
        }
        return count;
    }

    private void modificationsListForSellOneProductHuman(boolean flagForDecreaseOrDelete,
                                                         int indexForDecreaseOrDelete,
                                                         int bufferForQuantityProductPackage) {
        if (!flagForDecreaseOrDelete) {
            productsForSale.get(indexForDecreaseOrDelete).setQuantityProductPackage(bufferForQuantityProductPackage-1);
        }
        else {
            productsForSale.remove(indexForDecreaseOrDelete);
        }
    }

    public boolean sellOneProductHuman(String typeProduct, String brandProduct) {

        int indexForDecreaseOrDelete = 0;

        int bufferForQuantityProductPackage;

        boolean flagForDecreaseOrDelete;

        List<Product> findProductForPurchased =
                findTypeProductAndBrandProductInVM(typeProduct, brandProduct);

        if (findProductForPurchased.size() > 0) {

            revenueVendingMachine +=
                    findProductForPurchased.get(0).getCostProductPackage();

            bufferForQuantityProductPackage =
                    findProductForPurchased.get(0).getQuantityProductPackage();

            flagForDecreaseOrDelete =
                    (bufferForQuantityProductPackage == 1);

            indexForDecreaseOrDelete =
                    searchIndexInListForSellOneProductHuman(findProductForPurchased);

            modificationsListForSellOneProductHuman(flagForDecreaseOrDelete,
                    indexForDecreaseOrDelete, bufferForQuantityProductPackage);

            return true;
        }
        else {
            return false;
        }
    }

    public double getRevenue() {
        return revenueVendingMachine;
    }

    @Override
    public String toString() {
        String cherta = "*********************************************";
        StringBuilder strOut = new StringBuilder();
        for (Product product: productsForSale) {
            strOut.append("\n" + cherta + "\n");
            strOut.append(product.toString());
        }
        strOut.append("\n" + cherta);

        return strOut.toString();
    }

}
