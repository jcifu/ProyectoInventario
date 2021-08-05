package discountCalculatorProject;

import java.util.ArrayList;
import java.util.List;

public class ComplexCalculator implements DiscountCalculator {

    @Override
    public Integer calculate(List<Integer> priceList) {
        double discount = 0;
        int totalSale = 0;

        List<Integer> offerPriceList = new ArrayList<>();
        //Get discount by price, populate new list of prices with their discounts
        for (int i = 0; i < priceList.size(); i++) {
            int salePrice;
            if (priceList.get(i) > 5000) {
                if (priceList.get(i) > 20000) {
                    discount = 0.15;
                    System.out.println("Product Price: $" + priceList.get(i) + ". Discount: " + discount * 100 + "%.");
                    salePrice = (int) (priceList.get(i) * (1 - discount));

                    System.out.println("Final product price: $" + salePrice);
                    
                    offerPriceList.add(salePrice);
                } else {
                    discount = 0.1;
                    System.out.println("Product Price: $" + priceList.get(i) + ". Discount: " + discount * 100 + "%.");
                    salePrice = (int) (priceList.get(i) * (1 - discount));

                    System.out.println("Final product price: $" + salePrice);
                    
                    offerPriceList.add(salePrice);
                }
            } else if (priceList.get(i) > 3500) {
                discount = 0.05;
                System.out.println("Product Price: $" + priceList.get(i) + ". Discount: " + discount * 100 + "%.");
                salePrice = (int) (priceList.get(i) * (1 - discount));

                System.out.println("Final product price: $" + salePrice);
                
                offerPriceList.add(salePrice);
            }
        }
        
        for(int i = 0; i < offerPriceList.size(); i++){
            totalSale += offerPriceList.get(i);
            
            System.out.println("Accumulated sale: " + totalSale);
        }
        return totalSale;
    }
}
