package pt.up.fe.ldts.example2;

import java.awt.*;

public class Rectangle extends Shape {
    private double width;  // ONLY FOR RECTANGLES
    private double height; // ONLY FOR RECTANGLES

    public Rectangle(double x, double y, double width, double height) {
        //this.type = TYPE.RECTANGLE;
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void draw(GraphicFramework graphics) {
        graphics.drawLine(x, y, x + width, y);
        graphics.drawLine(x + width, y, x + width, y + height);
        graphics.drawLine(x + width, y + height, x, y + height);
        graphics.drawLine(x, y + height, x, y);
    }
}
