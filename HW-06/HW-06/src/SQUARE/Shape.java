
package SQUARE;


public abstract class Shape {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
   String name;
   double square;
    
    
    public abstract double count();
    
}
