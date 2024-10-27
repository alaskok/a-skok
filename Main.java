// public Class Animal
abstract class Animal {
    private static int count = 0; // Counter of created animals
    public String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

// Class Dog
class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " ran " + Math.min(distance, MAX_RUN_DISTANCE) + " meters.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " swam " + Math.min(distance, MAX_SWIM_DISTANCE) + " meters.");
    }
}

// Class Cat
class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0; // Cats can't swim
    private boolean hungry = false;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " ran " + Math.min(distance, MAX_RUN_DISTANCE) + " meters.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim.");
    }

    public void eat(int foodAmount, Bowl bowl) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            hungry = true;
            System.out.println(name + " ate and is now hungry.");
        } else {
            System.out.println(name + " couldn't eat, not enough food in the bowl.");
        }
    }
}

// Class Bowl
class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        if (foodAmount < 0) {
            this.foodAmount = 0; // Don't allow negative food amount
        } else {
            this.foodAmount = foodAmount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        }
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(10);

        Dog dog = new Dog("Tuzik");
        dog.run(150);
        dog.swim(5);

        Cat cat = new Cat("Barsik");
        cat.run(100);
        cat.swim(5);

        // Feed the cat
        cat.eat(5, bowl); // Enough food
        cat.eat(10, bowl); // Not enough food

        System.out.println("Total animals: " + Animal.getCount());
    }
}
