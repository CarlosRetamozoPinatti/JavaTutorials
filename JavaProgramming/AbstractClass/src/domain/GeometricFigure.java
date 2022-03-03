package domain;/*
A class which is declared with the abstract keyword is known as an abstract class in Java.
It can have abstract and non-abstract methods (method with the body).

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details,
for example, sending SMS where you type the text and send the message.
You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

 */


public abstract class GeometricFigure {
    protected String figureType;

    protected GeometricFigure(String figureType){
        this.figureType = figureType;
    }

    public abstract void draw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "domain.GeometricFigure{" +
                "figureType='" + figureType + '\'' +
                '}';
    }
}
