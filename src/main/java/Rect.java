import processing.core.PApplet;
import processing.core.PConstants;

public class Rect extends Shape {

    Rect() {}

    Rect(float x, float y, Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(PApplet pApplet) {
        super.draw(pApplet);
        pApplet.rect(super.getX(), super.getY(), 35, 35);
        pApplet.rectMode(PConstants.CENTER);
    }

    @Override
    public Rect clone() {
        return (Rect) super.clone();
    }

    @Override
    public boolean checkCollision(int mouseX, int mouseY) {
        return mouseX <= super.getX() + 35 / 2 && mouseX >= super.getX() - 35 / 2 && mouseY <= getY() + 35 / 2 && mouseY >= getY() - 35 / 2;
    }
}