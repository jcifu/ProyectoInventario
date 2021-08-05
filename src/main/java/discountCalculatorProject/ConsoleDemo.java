package discountCalculatorProject;

import java.util.ArrayList;

/**
 *
 * @author jacif
 */
public class ConsoleDemo {

    public static void main(String[] args) {
        int price;
        int upper = 10000;
        int lower = 1000;

        ArrayList<Integer> priceList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            price = (int) (Math.random() * (upper - lower) + lower);
            priceList.add(price);
            System.out.println(priceList.get(i));
        }

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        System.out.println("Total Sale : " + simpleCalculator.calculate(priceList).toString());
        
        
        ComplexCalculator complexCalculator = new ComplexCalculator();

        System.out.println("Total Sale : " + complexCalculator.calculate(priceList).toString());

    }

}
