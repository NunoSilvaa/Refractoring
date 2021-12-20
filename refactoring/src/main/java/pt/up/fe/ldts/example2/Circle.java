package pt.up.fe.ldts.example2;

public class Circle extends Shape {
    //private TYPE type;
    private double radius; // ONLY FOR CIRCLES

    public Circle(double x, double y, double radius) {
        //this.type = TYPE.CIRCLE;
        super(x,y);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(x, y, radius);

    }
}
