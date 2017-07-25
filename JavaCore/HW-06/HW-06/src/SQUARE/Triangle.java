
package SQUARE;


public class Triangle extends Shape{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name=name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
    
    
    
    @Override
    public double count(){
    
    
    double p=(getSideA()+getSideB()+getSideC())/2;
    square=Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
    
    
    return square;
    }
}
