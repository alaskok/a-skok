public class Park {
    // Название парка
    private String name;
    // Массив аттракcioнов
    private Attraction[] attractions;
    // Количество attractionsov
    private int count;

    // Конструктор класса Park
    public Park(String name,  int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.count = 0;
    }

    // Метод для добавления attractionsov
    public void addAttraction(String name,  String workingHours,  double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name,  workingHours,  price);
            count++;
        } else {
            System.out.println("В парке нет свободного места для добавления нового attractionsov.");
        }
    }

    // Метод для вывода информации об attractionsov
    public void printAttractions() {
        System.out.println("Attractionsov в парке " + name + ": ");
        for (int i = 0; i < attractions.length; i++) {
            if (attractions[i] != null) {
                attractions[i].printInfo();
            }
        }
    }

    // Внуренний class Attraction
    private class Attraction {
        private String name;         // Название attractionsov
        private String workingHours; // Время работы
        private double price;        // Стоимость

        // Конструктор class Attraction
        public Attraction(String name,  String workingHours,  double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об attractionsov
        public void printInfo() {
            System.out.println("Название:  " + name);
            System.out.println("Время работы:  " + workingHours);
            System.out.println("Стоимость:  " + price + " рублей.");
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        // Создаем объект парка с название "Сказочный парк" и максимальным свободным мест для attractionsov 5
        Park park = new Park("Сказочный парк",  5);

        // Добавляем attractionsov
        park.addAttraction("Американские горки",  "10: 00 - 22: 00",  200);
        park.addAttraction("Колесо обозрения",  "09: 00 - 21: 00",  150);
        park.addAttraction("Башня свободного падения",  "11: 00 - 20: 00",  250);
        park.addAttraction("Карусели",  "09: 00 - 20: 00",  100);
        park.addAttraction("Лабиринт",  "10: 00 - 19: 00",  175);

        // Печатаем информацию об attractionsov
        park.printAttractions();
    }
}
