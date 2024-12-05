package ru.springTest.shapeDraw;

import java.util.List;

public class Scene {
    List<Shape> objects;

    public Scene() {}

    public void draw() {
        objects.forEach(Shape::draw);
    }

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }
}
