import processing.core.PApplet;

abstract class Shape implements Cloneable {

    private float x;
    private float y;
    private Color color;

    Shape(float x, float y, Color color){
        this.x=x;
        this.y=y;
        this.color = color;
    }

    public Shape() {
        x=0;
        y=0;
        color=new Color();
    }


    abstract void draw(PApplet pApplet);

    abstract boolean checkCollision(int mouseX, int mouseY);
    @Override
    public Shape clone() {
        try {
            Shape shape = (Shape) super.clone();
            shape.color = this.color.clone();
            System.out.println("복사까지 되고 있는 거니");
            return shape;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    Color getColor() { return color; }

    void setColor(Color color) {
        this.color = color;
    }
}
