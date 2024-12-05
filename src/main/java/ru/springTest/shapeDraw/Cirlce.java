package ru.springTest.shapeDraw;

public class Cirlce extends Shape {
    private Coords cenetrCoords;
    private int radius;

    public Cirlce() {}

    public Cirlce(Coords cenetrCoords, int radius) {
        this.cenetrCoords = cenetrCoords;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисована фигура - " + this.toString() + "\n");
    }

    public String toString() {
        return String.format("круг с координатами центра [%d,%d], радиусом - [%d], c цветом - [%s]", this.getX(), this.getY(), this.getRadius(), this.getColor());
    }

    public int getX() {
        return cenetrCoords.getX();
    }

    public void setX(int x) {
        cenetrCoords.setX(x);
    }

    public int getY() {
        return cenetrCoords.getY();
    }

    public void setY(int y) {
        cenetrCoords.setY(y);
    }

    public Coords getCenetrCoords() {
        return cenetrCoords;
    }

    public void setCenetrCoords(Coords cenetrCoords) {
        this.cenetrCoords = cenetrCoords;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
