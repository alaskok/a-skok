// Interface for shapes
interface Shape {
    double calculateArea();
    double calculatePerimeter();
    String getFillColor();
    String getBorderColor();
}

// Class for circle
class Circle implements Shape {
    double radius;
    String fillColor;
    String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Class for rectangle
class Rectangle implements Shape {
    double width;
    double height;
    String fillColor;
    String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Class for triangle
class Triangle implements Shape {
    double base;
    double height;
    double sideA;
    double sideB;
    double sideC;
    String fillColor;
    String borderColor;

    public Triangle(double base, double height, double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Main class for drawing
public class Interfaces {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red", "Black");
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue", "Green");
        Shape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0, "Yellow", "Purple");

        System.out.printf("Circle: Area = %.2f, Perimeter = %.2f, Fill Color = %s, Border Color = %s%n",
                circle.calculateArea(), circle.calculatePerimeter(), circle.getFillColor(), circle.getBorderColor());

        System.out.printf("Rectangle: Area = %.2f, Perimeter = %.2f, Fill Color = %s, Border Color = %s%n",
                rectangle.calculateArea(), rectangle.calculatePerimeter(), rectangle.getFillColor(), rectangle.getBorderColor());

        System.out.printf("Triangle: Area = %.2f, Perimeter = %.2f, Fill Color = %s, Border Color = %s%n",
                triangle.calculateArea(), triangle.calculatePerimeter(), triangle.getFillColor(), triangle.getBorderColor());
    }
}
