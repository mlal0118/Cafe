package coffee;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Cafe {
    private List<CoffeeOrder> coffeeOrderList;

    public Cafe(List<CoffeeOrder> coffeeOrderList) {
        this.coffeeOrderList = coffeeOrderList;
    }

    public void addCoffeeOrder(CoffeeOrder coffeeOrder) {
        this.coffeeOrderList.add(coffeeOrder);
    }

    public long getTotalIncome(LocalDate date) {
        return this.coffeeOrderList.stream()
                .filter(buyDate -> buyDate.getDateTime().equals(date))
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .mapToLong(coffee -> coffee.getPrice())
                .sum();
    }
}
