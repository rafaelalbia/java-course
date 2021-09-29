package entities.exercise25;

public class Rectangle {
    
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width * 2) + (height * 2);
    }

    public double diagonal() {
        return (width * width) + (height * height);
    }
}
