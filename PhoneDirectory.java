package PhoneDirectory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(phoneNumber);
    }

    // Метод для получения всех телефонов по фамилии
    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }

    // Пример использования класса
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Ivanov", "+375291234567");
        phoneDirectory.add("Ivanov", "+375441234567");
        phoneDirectory.add("Petrov", "+375297654321");

        System.out.println("Phones for Ivanov: " + phoneDirectory.get("Ivanov"));
        System.out.println("Phones for Petrov: " + phoneDirectory.get("Petrov"));

        // Если фамилия не найдена в справочнике
        System.out.println("Phones for Sidorov: " + phoneDirectory.get("Sidorov"));
    }
}
