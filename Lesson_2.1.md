public class Sotrudnik {
    //Поля класса
    private String fio; // ФИО
    private String dolzhnost; //Должность
    private String email; //Email
    private String telefon; //Телефон
    private double zarplata; //Зарплата
    private int vozrast; //Возраст

    //Конструктор класса
    public Sotrudnik(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    //Метод для вывода информации об объекте
    public void printInfo() {
        System.out.println("ФИО:  " + fio);
        System.out.println("Должность:  " + dolzhnost);
        System.out.println("Email:  " + email);
        System.out.println("Телефон:  " + telefon);
        System.out.println("Зарплата:  " + zarplata);
        System.out.println("Возраст:  " + vozrast);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        //Создание массива из 5 сотрудников
        Sotrudnik[] persArray = new Sotrudnik[5];

        //Заполнение массива данными
        persArray[0] = new Sotrudnik("Иванов Сергей", "Инженер", "ivanov@gmail.com", "292312312", 30000, 30);
        persArray[1] = new Sotrudnik("Петров Александр", "Менеджер", "petrov@gmail.com", "292312313", 40000, 28);
        persArray[2] = new Sotrudnik("Сидоров Евгений", "Разработчик", "sidorov@gmail.com", "292312314", 50000, 35);
        persArray[3] = new Sotrudnik("Кузнецов Николай", "Аналитик", "kuznetsov@gmail.com", "292312315", 45000, 32);
        persArray[4] = new Sotrudnik("Смирнова Анна", "Дизайнер", "smirnova@gmail.com", "292312316", 35000, 27);

        //Вывод информации о сотрудниках
        for (Sotrudnik sotrudnik : persArray) {
            sotrudnik.printInfo();
        }
    }
}
