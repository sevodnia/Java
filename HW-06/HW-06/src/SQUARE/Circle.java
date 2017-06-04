
package SQUARE;
 

public class Circle extends Shape{
    double radius;

    public Circle(String name, double radius) {
        this.name=name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    
    
   @Override
   public double count(){
   
           square = getRadius()*getRadius()*Math.PI;

        return square;
   
   
   
   }
    
}
