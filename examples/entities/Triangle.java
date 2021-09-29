package entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double area() {
        
        double value;

        value = (a + b + c) / 2;
        return Math.sqrt(value * (value - a) * (value - b) * (value - c));

    }
}
