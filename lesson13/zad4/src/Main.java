import java.util.HashMap;
import java.util.Map;

public class Main {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Main pizzeria = new Main();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
       orders.put(clientName, orders.getOrDefault(clientName, 0) + 1);
    }

    private void printStatistics() {
        int total = 0;
        for(Map.Entry<String, Integer> entry: orders.entrySet()) {
            String clientName = entry.getKey();
            int count = entry.getValue();
            System.out.println("Заказов от " + clientName + ": " + count);
            total += count;
        }
        System.out.println("Всего заказов: " + total);
    }
}