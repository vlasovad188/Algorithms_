import java.util.HashMap;

public class SimpleExample {
    public static void main(String[] args) {
        // Используем готовую реализацию HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Добавляем элементы
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 8);
        
        // Выводим содержимое
        System.out.println("HashMap: " + map);
        
        // Получаем значения
        System.out.println("apple -> " + map.get("apple"));
        System.out.println("banana -> " + map.get("banana"));
        
        // Обновляем значение
        map.put("apple", 10);
        System.out.println("updated apple -> " + map.get("apple"));
        
        // Проверяем наличие ключа
        System.out.println("Contains 'orange': " + map.containsKey("orange"));
    }
}
