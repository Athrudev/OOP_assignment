class Fruit {
    private String name;
    private String color;
    private double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Weight: " + weight + " g");
    }
}

class Apple extends Fruit {
    private String variety;

    public Apple(String name, String color, double weight, String variety) {
        super(name, color, weight);
        this.variety = variety;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Variety: " + variety);
    }
}

class Banana extends Fruit {
    private int ripeness;

    public Banana(String name, String color, double weight, int ripeness) {
        super(name, color, weight);
        this.ripeness = ripeness;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ripeness: " + ripeness);
    }
}

public class one {
    public static void main(String[] args) {
        Apple apple = new Apple("Red Delicious", "Red", 150.0, "Red Delicious");
        Banana banana = new Banana("Cavendish", "Yellow", 100.0, 8);

        apple.displayInfo();
        System.out.println();
        banana.displayInfo();
    }
}