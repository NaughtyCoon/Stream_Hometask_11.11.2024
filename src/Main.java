import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ArrayList<Transaction> transList = new ArrayList<>();
        transList.add(new Transaction("Bread", 2, 32));
        transList.add(new Transaction("Milk", 1, 72));
        transList.add(new Transaction("Cheese", 3, 180));
        transList.add(new Transaction("Cream", 1, 70));
        transList.add(new Transaction("Cola", 5, 83));

        double quantity = transList.stream()
                .mapToDouble(Transaction::getQuantity)
                .sum();
        System.out.println("Всего продано товаров: " + quantity + " шт.");

        double sum = transList.stream()
                .mapToDouble(Transaction::getTotalPrice)
                .sum();
        System.out.println("Общая сумма продаж: " + sum + " руб.");

        Transaction maxQty = transList.stream()
                .max(Comparator.comparingInt(Transaction::getQuantity))
                .orElse(null);
        System.out.println("Самый продаваемый продукт: " + maxQty.getProduct());

        Transaction minQty = transList.stream()
                .min(Comparator.comparingInt(Transaction::getUnitPrice))
                .orElse(null);
        System.out.println("Самый дешёвый продукт: " + minQty.getProduct());
    }
}