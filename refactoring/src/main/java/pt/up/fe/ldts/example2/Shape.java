package pt.up.fe.ldts.example2;

public abstract class Shape {
    //enum TYPE {RECTANGLE, CIRCLE}

    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void draw(GraphicFramework graphics);

   /* public Shape(double x, double y, double radius) {
        //this.type = TYPE.CIRCLE;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        /*switch (type) {
            case RECTANGLE:
                return width * height;
            case CIRCLE:
                return Math.PI * Math.pow(radius, 2);
            default:
                throw new Exception("Shape with no type");
        }

    }

    public double getPerimeter() throws Exception {
        switch (type) {
            case RECTANGLE:
                return 2 * (width + height);
            case CIRCLE:
                return 2 * Math.PI * radius;
            default:
                throw new Exception("Shape with no type");
        }
    }

    public void draw(GraphicFramework graphics) {
        switch (type) {
            case RECTANGLE:
                graphics.drawLine(x, y, x + width, y);
                graphics.drawLine(x + width, y, x + width, y + height);
                graphics.drawLine(x + width, y + height, x, y + height);
                graphics.drawLine(x, y + height, x, y);
                break;
            case CIRCLE:
                graphics.drawCircle(x, y, radius);
                break;
        }
    }*/
}
