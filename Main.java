class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    // Constructor
    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Override toString method for displaying employee information
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Declare an array of objects
        Person[] persArray = new Person[5];

        // Initialize each element of the array
        persArray[0] = new Person("Иванов Сергей", "Инженер", "ivanov@gmail.com", "292312312", 30000, 30);
        persArray[1] = new Person("Петров Александр", "Менеджер", "petrov@gmail.comm", "292312313", 40000, 35);
        persArray[2] = new Person("Сидоров Евгений", "Разработчик", "sidorov@gmail.com", "292312314", 35000, 28);
        persArray[3] = new Person("Кузнецов Николай", "Дизайнер", "kuznetsov@gmail.com", "292312315", 45000, 27);
        persArray[4] = new Person("Смирнова Анна", "Аналитик", "smirnova@gmail.comm", "292312316", 50000, 32);

        // Output information about all employees
        for (Person person : persArray) {
            System.out.println(person);
        }
    }
}

