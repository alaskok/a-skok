public class Park {
    // Название парка
    private String name;
    // Массив аттракционов
    private Attraction attractions;
    // Количество аттракционов
    private int count;

    // Конструктор класса Park
    public Park(String name, int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.count = 0;
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String workingHours, double price) {
        if (count &lt; attractions.length)            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        } else {
            System.out.println(&quot;В парке нет свободного места для добавления нового аттракциона.&quot;);
        }
    }

    // Метод для вывода информации об атракционах
    public void printAttractions() {
        System.out.println(&quot;Атракционы в парке &quot; + name + &quot;:&quot;);
        for (int i = 0; i &lt;; i++) {
            attractions[i].printInfo();
        }
    }

    // Внутренний класс Attraction
    private class {
        private String name         // Название аттракциона
        private String workingHours; // Время работы
        private double price;        // Стоимость

        // Конструктор класса Attraction
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println(&quot;Название: &quot; + name);
            System.out.println(&quot;Время работы: &quot; + workingHours);
            System.out.println(&quot;Стоимость: &quot; + price + &quot; руб.&quot;);
            System.out.println(&quot;------------------------------&quot;);
        }
    }

    public static void main(String args) {
        // Создаем объект парка с названием &quot;Сказочный парк&quot; и максимальным количеством аттракционов 5
        Park park = new Park(&quot;Сказочный парк&quot;, 5);

        // Добавляем аттракционы
        park.addAttraction(&quot;Американские горки&quot;, &quot;10:00 - 22:00&quot;, 200);
        park.addAttraction(&quot;Колесо обозрения&quot;, &quot;09:00 - 21:00&quot;, 150);
        park.addAttraction(&quot;Башня свободного падения&quot;, &quot;11:00 - 20:00&quot;, 250);
        park.addAttraction(&quot;Карусели&quot;, &quot;09:00 - 20:00&quot;, 100);
        park.addAttraction(&quot;Лабиринт&quot;, &quot;10:00 - 19:00&quot;, 175);

        // Печатаем информацию об аттракционах
        park.printAttractions();
    }
}
