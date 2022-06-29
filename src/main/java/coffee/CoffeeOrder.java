package coffee;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class CoffeeOrder {
    private List<Coffee> coffeeList;
    private LocalDate dateTime;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDate dateTime) {
        this.coffeeList = coffeeList;
        this.dateTime = dateTime;
    }

    public List<Coffee> getCoffeeList() {
        return Collections.unmodifiableList(coffeeList);
    }

    public LocalDate getDateTime() {
        return dateTime;
    }
}
