
package discountCalculatorProject;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalculator implements DiscountCalculator {
    
    @Override
    public Integer calculate(List<Integer> priceList){
        double discount = 0.1;
        int totalSale = 0;
        int salePrice;
        List <Integer> offerPriceList = new ArrayList<>();
        
        for(int j = 0; j < priceList.size(); j++){
            System.out.println("Product Price: $"+ priceList.get(j) +". Discount: " + discount*100 + "%.");
            salePrice = (int) (priceList.get(j)*(1 - discount));
            System.out.println("Final product price: $" + salePrice);
            
            offerPriceList.add(salePrice);
       }
         
        for(int i = 0; i < offerPriceList.size(); i++){
            totalSale += offerPriceList.get(i);
            
            System.out.println("Accumulated sale: " + totalSale);
        }
        return totalSale;
    }
    
}
