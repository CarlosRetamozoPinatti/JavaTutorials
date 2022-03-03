package domain;

public class Rectangle extends GeometricFigure {
    public Rectangle(String figureType){
        super(figureType);
    }

//The abstract method is not overwritten, but implemented for the first time.
//That's why an "I" appears instead of an "O".
    @Override
    public void draw(){
        System.out.println("Draws a: " + this.getClass().getSimpleName());
    }
}
