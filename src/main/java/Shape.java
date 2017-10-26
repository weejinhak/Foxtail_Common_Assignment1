import processing.core.PApplet;

abstract class Shape implements Cloneable {

    private float x;
    private float y;
    private Color color;

    Shape(){}

    Shape(float x, float y, Color color){
        this.x=x;
        this.y=y;
        this.color = color;
    }


    public void draw(PApplet pApplet){
        pApplet.fill(color.getRed(), color.getGreen(), color.getBlue());
    }

    abstract boolean checkCollision(int mouseX, int mouseY);
    @Override
    public Shape clone() {
        try {
            Shape shape = (Shape) super.clone();
            shape.color = this.color.clone();
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

    Color getColor() {
        return color;
    }

    void setColor(Color color) {
        this.color = color;
    }
}
