
package SQUARE;


public class Square extends Shape{
    private double sideA;

    public Square(String name,double sideA) {
        this.name=name;
        this.sideA = sideA;
    }


    
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }


    
    
    @Override
    
      public double count() {
        square = getSideA() * getSideA();

        return square;
    }
    
    
}
